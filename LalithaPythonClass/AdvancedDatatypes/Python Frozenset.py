# Frozensets
# initialize A and B
from builtins import print

A = frozenset([1, 2, 3, 4])
B = frozenset([3, 4, 5, 6])
print(A.isdisjoint(B)) # False

A = frozenset([1, 2, 7, 8])
B = frozenset([3, 4, 5, 6])
print(A.isdisjoint(B)) # true

A = frozenset([1, 2, 7, 8])
B = frozenset([3, 4, 5, 6])
print(A.difference(B)) # ({8, 1, 2, 7})

A = frozenset([1, 2, 7, 8,3,4])
B = frozenset([3, 4, 5, 6])
print(A.difference(B)) # frozenset({8, 1, 2, 7})
print(B.difference(A)) #frozenset({5, 6})


print("=============")
A=frozenset({1, 2, 3, 4, 5, 6})
#A.add(3)
#print(A) #'frozenset' object has no attribute 'add': we dont have add method in Frozenset

