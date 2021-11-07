

try:
   number=int(input("Enter a number :"))
   assert number%2==0
except:
    print("Not an even number!")
else:
    reciprocal = 1/number
    print(reciprocal)

# Enter a number :3
# Not an even number!

# Enter a number :4
# 0.25

# Enter a number :0
# Traceback (most recent call last):
#   File "C:/Users/Sony/PycharmProjects/LalithaClass/LalithaPythonClass/Exceptions/ExceptionTryWithElse.py", line 9, in <module>
#     reciprocal = 1/number
# ZeroDivisionError: division by zero