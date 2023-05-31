principal = float(input("Enter the loan amount: "))
rate = float(input("Enter the profit rate (in percentage): "))
term = int(input("Enter the loan term (in months): "))

monthly_rate = rate / 1200
emi = (principal * monthly_rate * ((1 + monthly_rate) ** term)) / (((1 + monthly_rate) ** term) - 1)

total_interest = 0
balance = principal

print("Month\tPayment\t\tInterest\tPrincipal\tBalance")
for i in range(1, term+1):
    interest = balance * monthly_rate
    principal_paid = emi - interest
    balance -= principal_paid
    total_interest += interest
    print(f"{i}\t{emi:.2f}\t\t{interest:.2f}\t\t{principal_paid:.2f}\t\t{balance:.2f}")

apr = ((emi / principal) - 1) * 1200
print(f"\nTotal interest: {total_interest:.2f}")
print(f"APR: {apr:.4f}%")
