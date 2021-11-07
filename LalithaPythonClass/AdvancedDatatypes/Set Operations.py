from builtins import print

A = {1, 2, 3, 4, 5}
B = {4, 5, 6, 7, 8}
# union operator : |
print(A | B) # {1, 2, 3, 4, 5, 6, 7, 8}

print(A.union(B)) # {1, 2, 3, 4, 5, 6, 7, 8}
print(B.union(A)) # {1, 2, 3, 4, 5, 6, 7, 8}
