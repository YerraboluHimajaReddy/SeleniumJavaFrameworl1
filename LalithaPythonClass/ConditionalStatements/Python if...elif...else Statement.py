'''In this program,
we check if the number is positive or
negative or zero and
display an appropriate message'''
from builtins import print

num = -10
print(num) #3.4

# Try these two variations as well:
# num = 0
# num = -4.5

if num > 0:
    print("Positive number") #Positive number
elif num == 0:
    print("Zero") #Zero
else:
    print("Negative number") #Negative number
