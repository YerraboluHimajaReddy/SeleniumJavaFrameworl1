# initialize my_set
my_set = {1, 3}
print(my_set) # {1, 3}

#print( my_set[0])
# if you uncomment the above line
# you will get an error
# TypeError: 'set' object does not support indexing

# add an element
# Output: {1, 2, 3}
my_set.add(2)
print(my_set) #{1, 2, 3}

my_set.add(4)
print(my_set) # {1, 2, 3, 4}

print("===========")
# add multiple elements
my_set.update([2, 3, 4,5,6])
print(my_set) # {1, 2, 3, 4, 5, 6}

# add list and set
my_set.update([9, 7,8], {10, 60, 80})
print(my_set) # {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 80, 60}




