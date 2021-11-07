# Program to find the sum of all numbers stored in a list

# List of numbers
from builtins import print

numbers = [6, 5, 3, 8, 4, 2, 5, 4, 11]
print(numbers) #[6, 5, 3, 8, 4, 2, 5, 4, 11]

for eachnum in numbers:
     print(eachnum)
     #6
     #5
     #3
     #8
     #4
     #2
     #5
     #4
     #11

# variable to store the sum
sum = 0

for eachnum in numbers:
     sum=sum+eachnum
     print(sum)
     
print(sum) #48
