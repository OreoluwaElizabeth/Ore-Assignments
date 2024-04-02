principal = int(input("Enter principal:"))

intrestrate = int(input("Enter annual intrest rate:"))

duration = int(input("Enter duration of years:"))

MONTH_IN_A_YEAR = 12

PERCENTAGE_RATE = 100

numofyears = MONTH_IN_A_YEAR * duration

rate = intrestrate / PERCENTAGE_RATE

monthlyrate = rate / MONTH_IN_A_YEAR

monthbase = 1 + monthlyrate

model = monthbase ** numofyears

number1 = principal * monthlyrate

number2 = model - 1

monthlypayment = number1 * model / number2

print(f" The monthly payment is : ${monthlypayment:,.2f}")