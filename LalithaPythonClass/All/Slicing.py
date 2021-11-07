# Accessing tuple elements using slicing
from builtins import print

my_tuple = ('p','r','o','g','r','a','m','i','z')
print(my_tuple ) # ('p', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 'z')

# elements 2nd to 4th
# Output: ('r', 'o', 'g')
print(my_tuple[1:4]) # ('r', 'o', 'g')

# elements beginning to 2nd
# Output: ('p', 'r')
print(my_tuple[:-7]) # ('p', 'r')

# elements 8th to end
# Output: ('i', 'z')
print(my_tuple[7:])# ('i', 'z')

# elements beginning to end
# Output: ('p', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 'z')
print(my_tuple[:]) # ('p', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 'z')

print("=================================")
#Changing a Tuple
# Changing tuple values
my_tuple = (4, 2, 3, [6, 5])
print(my_tuple)
#my_tuple[1] = 9
#print(my_tuple) # my_tuple[1] = 9 : 'tuple' object does not support item

# However, item of mutable element can be changed
my_tuple[3][0] = 9    # Output: (4, 2, 3, [9, 5])
print(my_tuple) # (4, 2, 3, [9, 5])

#Concatenation
print((1, 2, 3) + (4, 5, 6)) # (1, 2, 3, 4, 5, 6)
print(("Repeat",) * 3) # ('Repeat', 'Repeat', 'Repeat')


