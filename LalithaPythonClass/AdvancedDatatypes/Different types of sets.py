# Different types of sets in Python
# set of integers
# set will not allow indexing access
from builtins import print

my_set = {1, 2, 3}
print(my_set) # {1, 2, 3}

# set of mixed datatypes
my_set = {1.0, "Hello", (1, 2, 3)}
print(my_set) # {1.0, 'Hello', (1, 2, 3)}
#print(my_set[2][0]) #  print(my_set[2][0]): 'set' object does not support indexing


print("====================")
# set will not allow duplicates
# set cannot have duplicates
my_set = {1, 2, 3, 4, 3, 2}
print(my_set) # {1, 2, 3, 4}

print("==================")
# we can make set from a list, we are converting the list into set
my_set = set([1, 2, 3, 2])
print(my_set) # {1, 2, 3}

my_set = {"Hello", 10, 10.2}
print(my_set) # {10.2, 10, 'Hello'}

print("=======================")
# set cannot have mutable items
# here [3, 4] is a mutable list
#my_set = {1, 2, [3, 4]} # my_set = {1, 2, [3, 4]} : unhashable type: 'list'

# set will not allow list directly and it has to convert set([1, 2, 3, 2]) and it will access
my_list=[]
print(my_list) # []


print("===============")
# initialize a with {}
a = {1}
print(a) # {}
print(type(a)) # <class 'set'>

a = [1]
print(a)

# check data type of a
print(type(a)) # <class 'list'>

a = []
print(a)

# check data type of a
print(type(a)) # <class 'list'>

print("==================")
# initialize a with set()
a = set()

# check data type of a
print(type(a)) # <class 'set'>

# initialize a with {}
a = {}
print(type(a)) # <class 'dict'>

















