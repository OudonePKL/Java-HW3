
# Enter a number and write "zero" if it is 0, "plus" if it is positive,
# and "minus" if it is negative.

# @author: Oudone PKL


# function for check the numbers
def checkNumber(num):
    result = ""
    if num > 0:
        result = "Plus"
    elif num < 0:
        result = "Minus"
    else:
        result = "Zero"
    
    print(result)


# input value from user
num = int(input("Enter the numbers: "))

# call the function
checkNumber(num)