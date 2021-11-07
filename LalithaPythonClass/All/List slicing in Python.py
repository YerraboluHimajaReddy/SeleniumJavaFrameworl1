# List slicing in Python
from builtins import print

my_list = ['p','r','o','g','r','a','m','i','z']

# includes element at index 2, 3, 4
# excludes element at index 5
print(my_list[2:5]) # ['o', 'g', 'r']

# elements beginning to 4th
print(my_list[:-5]) # ['p', 'r', 'o', 'g']

# elements 6th to end
print(my_list[5:]) # ['a', 'm', 'i', 'z']

# elements beginning to end
print(my_list[:]) # ['p', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 'z']

# Correcting mistake values in a list
odd = [2, 4, 6, 8]
print(odd) # [2, 4, 6, 8]

# modifying single element value in a list
odd[0]=10
print(odd) # [10, 4, 6, 8]

# change 2nd to 4th items
odd[1:4] = [3, 5, 7] # [10, 3, 5, 7]
print(odd)

# adding new element value to a list using append method
odd.append(55)
print(odd) # [10, 3, 5, 7, 55]

# adding new multiple element value to a list using append method
odd.extend([9, 11, 13])
print(odd) #[10, 3, 5, 7, 55, 9, 11, 13]

# Concatenating and repeating lists
print(odd+[45,56,67]) # [10, 3, 5, 7, 55, 9, 11, 13, 45, 56, 67]
print(["re"] * 3) # ['re', 're', 're']

print("====================")
# Demonstration of list insert() method
odd = [1, 9]
odd.insert(1,3)
print(odd) # [1, 3, 9]

odd[2:2] = [5, 7]
print(odd) # [1, 3, 5, 7, 9]

odd[1:1] = [5, 7,10,12]
print(odd) # [1, 5, 7, 10, 12, 3, 5, 7, 9]







