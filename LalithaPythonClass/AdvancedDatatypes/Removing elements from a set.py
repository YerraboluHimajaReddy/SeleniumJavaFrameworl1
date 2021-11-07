# Difference between discard() and remove()

# initialize my_set
my_set = {1, 3, 4, 5, 6}
print(my_set) #{1, 3, 4, 5, 6}

# discard an element
my_set.discard(4)
print(my_set) # {1, 3, 5, 6}

# remove an element
my_set.remove(6)
print(my_set) # {1, 3, 5}

# discard an element
# not present in my_set
my_set.discard(2)
print(my_set) # {1, 3, 5}

#my_set.remove(2)
#print(my_set) #     my_set.remove(2) : the 2 element is not there in the list

print("===================")
# initialize my_set
my_set = set("HelloWorld")
print(my_set) # {'H', 'e', 'o', 'W', 'r', 'd', 'l'}

# pop an element
# Output: random element, returns the first charcater in a set
print(my_set.pop()) # H

# pop another element
my_set.pop()
print(my_set) # {'W', 'o', 'l', 'e', 'r'}

my_set.pop()
print(my_set) # {'l', 'o', 'e', 'r'}

my_set.clear()
print(my_set) # set() : prints empty set








