# Difference of two sets
# initialize A and B
A = {1, 2, 3, 4, 5}
B = {4, 5, 6, 7, 8}

# use - operator on A
print(A - B) #{1, 2, 3}
print(B - A) #{8, 6, 7}

print(A.difference(B)) #{1, 2, 3}
print(B.difference(A)) #{8, 6, 7}
