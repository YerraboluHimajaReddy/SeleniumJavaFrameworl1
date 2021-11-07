# Deleting list items
from builtins import print

my_list = ['p', 'r', 'o', 'b', 'l', 'e', 'm']
print(my_list) # ['p', 'r', 'o', 'b', 'l', 'e', 'm']

# delete one item
del my_list[2]
print(my_list) # ['p', 'r', 'b', 'l', 'e', 'm']

# delete multiple items
del my_list[1:5]
print(my_list) # ['p', 'm']

# delete entire list
del my_list

# Error: List not defined
#print(my_list) #  print(my_list) : name 'my_list' is not defined

print("======================")
my_list = ['p','r','o','b','l','e','m']
print(my_list) # ['p', 'r', 'o', 'b', 'l', 'e', 'm']
my_list.remove('p')
print(my_list) # ['r', 'o', 'b', 'l', 'e', 'm']

print(my_list.pop(1)) # o
print(my_list) # ['r', 'b', 'l', 'e', 'm']

print(my_list.pop()) # m
print(my_list) # ['r', 'b', 'l', 'e']

my_list.clear()
print(my_list) # displays empty list []

print("==================")
my_list = ['p','r','o','b','l','e','m']
print(my_list) # ['p', 'r', 'o', 'b', 'l', 'e', 'm']
my_list[2:3] = []
print(my_list) # ['p', 'r', 'b', 'l', 'e', 'm']
my_list[2:5] = []
print(my_list) # ['p', 'r', 'm']

my_list = [3, 8, 1, 6, 0, 8, 4]
print(my_list) # [3, 8, 1, 6, 0, 8, 4]
my_list.sort()
print(my_list) # [0, 1, 3, 4, 6, 8, 8]
