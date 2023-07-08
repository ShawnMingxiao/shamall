package com.lmx.shamall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmx.shamall.common.utils.PageUtils;
import com.lmx.shamall.common.utils.Query;

import com.lmx.shamall.product.dao.CategoryDao;
import com.lmx.shamall.product.entity.CategoryEntity;
import com.lmx.shamall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listTree(Map<String, Object> params) {

        //find all category
        //null 表示不加查询条件
        List<CategoryEntity> selectList = baseMapper.selectList(null);

        List<CategoryEntity> firstLevelMenu = selectList.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        }).peek((menu)-> menu.setChildren(getAllChildren(menu, selectList))).sorted((menu1, menu2) ->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        //firstLevelMenu.stream()

        return firstLevelMenu;
    }

    private List<CategoryEntity> getAllChildren(CategoryEntity entity, List<CategoryEntity> all) {
        return all.stream().filter((categoryEntity) ->{
            return Objects.equals(categoryEntity.getParentCid(), entity.getCatId());
        }).peek((menu)-> menu.setChildren(getAllChildren(menu,all))).sorted((menu1, menu2) ->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
    }


}