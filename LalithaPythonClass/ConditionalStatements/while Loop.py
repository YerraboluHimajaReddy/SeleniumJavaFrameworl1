# Program to add natural
# numbers up to
# sum = 1+2+3+...+n

# To take input from the user,
natural_number = int(input("Enter number: "))


# initialize sum and counter
sum = 0
counter = 1

while counter <= natural_number:
    sum = sum + counter
    print(" Sum is ", sum)
    counter = counter+1
    print(" Counter is ",counter)# update counter

# print the sum
print("The sum is", sum)

# print the counter
print("The counter is", counter)

