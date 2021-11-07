# Deleting tuples
my_tuple = ('p', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 'z')
print(my_tuple)

# can't delete items
# TypeError: 'tuple' object doesn't support item deletion
#del my_tuple[3]

# Can delete an entire tuple
del my_tuple

# NameError: name 'my_tuple' is not defined
#print(my_tuple) # print(my_tuple): name 'my_tuple' is not defined


print("================")
# Tuple Methods
my_tuple = ('a', 'p', 'p', 'l', 'e',)

print(my_tuple.count('p'))  # Output: 2
print(my_tuple.index('l')) # Output: 3

print("====================")
# Membership test in tuple
my_tuple = ('a', 'p', 'p', 'l', 'e',)

# In operation
print('a' in my_tuple) # True
print('b' in my_tuple) # False

# Not in operation
print('g' not in my_tuple) # True

print("==============")
# Using a for loop to iterate through a tuple
for name in ('John', 'Kate'):
    print("Hello", name) # Hello John, Hello Kate



