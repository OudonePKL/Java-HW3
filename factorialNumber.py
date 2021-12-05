# Find the factorial of the input number

# @author: Oudone PKL

# Function for find the factorial of the input number

def findFactorialNumber(num):
    fact = 1
    i = 1
    while i <= num:
        fact = fact * i
        i += 1
    
    print("Result: ", fact)

# input the value
num = int(input("Enter the numbers: "))

# call the function
findFactorialNumber(num)
