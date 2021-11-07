# Membership Test for Dictionary Keys
squares = {1: 1, 3: 9, 5: 25, 7: 49, 9: 81}
print(squares)
print(1 in squares) # true
print(2 in squares) # false
print(2 not in squares) # true
print(49 in squares) #False

# Iterating through a Dictionary
squares = {1: 1, 3: 9, 5: 25, 7: 49, 9: 81}
for i in squares:
    print(squares[i])

    #1
    #9
    #81
    #25
    #49

    print("=================")
    # Dictionary Built-in Functions
    squares = {0: 0, 1: 1, 3:9, 4 :16, 5: 25, 6:36,  7:49, 8:64, 9:81, 3:9}

    print(all(squares)) #False
    print(len(squares)) #10
    print(any(squares)) # true
    print(squares)
    print(sorted(squares)) #[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


