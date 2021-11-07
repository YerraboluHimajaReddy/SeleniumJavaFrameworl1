# Removing elements from a dictionary

# create a dictionary
from builtins import print

squares = {1: 1, 2: 4, 3: 9, 4: 16, 5: 25}
print(squares) #{1: 1, 2: 4, 3: 9, 4: 16, 5: 25}

# remove a particular item, returns its value
print(squares.pop(4)) # 16
print(squares) #{1: 1, 2: 4, 3: 9, 5: 25}

#print(squares.pop()) # print(squares.pop()) # TypeError: pop expected at least 1 arguments, got 0
#print(squares)

# remove an arbitrary item, return (key,value)
# Output: (5, 25)
print(squares.popitem()) # (1, 1)
print(squares) #{2: 4, 3: 9, 5: 25}


print("==============================")
# copy
new_Square=squares.copy()
print(new_Square) #{2: 4, 3: 9, 5: 25}

print("=====================")
# remove all items
squares.clear()
print(squares) #{}


# delete the dictionary itself
del squares
#print(squares) #print(squares) : NameError: name 'squares' is not defined







