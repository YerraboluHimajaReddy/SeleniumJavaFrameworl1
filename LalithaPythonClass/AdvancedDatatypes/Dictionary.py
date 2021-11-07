# empty dictionary
from builtins import print

my_dict = {}
print(my_dict) # {}

# dictionary with integer keys
my_dict = {1: 'apple', 2: 'ball'}
print(my_dict) # {1: 'apple', 2: 'ball'}
print(my_dict[1]) # apple
print(my_dict.get(1)) # apple

# duplicating key : it will replace the old value
my_dict = {1: 'apple', 2: 'ball', 1: 'Banana'}
print(my_dict) #{1: 'Banana', 2: 'ball'}

# dictionary with mixed keys
my_dict = {'name': 'John', 1: [2, 4, 3]}
print(my_dict[1]) # [2, 4, 3]
print(my_dict[1][0]) # 2
print(my_dict['name']) #John

# using dict()
my_dict = dict({1:'apple', 2:'ball'})
print(my_dict[1]) #apple

# from sequence having each item as a pair
my_dict = dict([(1,'apple'), (2,'ball')])
print(my_dict) #{1: 'apple', 2: 'ball'}
print(my_dict[1]) # apple
print(my_dict[2]) #ball
#print(my_dict[3]) # print(my_dict[3]):  KeyError: 3
print(my_dict.get(3))  #None

print("==============================")
# get vs [] for retrieving elements
my_dict = {'name': 'Jack', 'age': 26}
print(my_dict['name']) # Jack
print(my_dict.get('age')) #26
print(my_dict.get('address')) #None
#print(my_dict['address']) #   print(my_dict['address']) ,KeyError: 'address'



