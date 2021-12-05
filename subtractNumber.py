
# Make two numbers as input,subtract the larger number from 
# the smaller number and print the result.

# @author: Oudone PKL

# Function for subtract the larger number from the smaller number
def subtractNum(num1, num2):

    result = 0

    if num1 > num2:
        result = num1 - num2
    else:
        result = num2 - num1
    
    print("Result: ", result)

# create variables and input from user
num1 = int(input("Enter the numbers: "))
num2 = int(input("Enter the numbers: "))

# call the function
subtractNum(num1, num2)