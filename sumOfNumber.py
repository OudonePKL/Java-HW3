# Sum the entered digits program

# @author: Oudone PKL


def checkNumber():
    num = int(input("Enter the numbers: "))
    summation = 0

    while num > 0:
        summation = summation + (num % 10)
        # print(summation , " ", num)
        num = num / 10

    print("Result: ", summation)

# call the function
checkNumber()


