# Different types of tuples

# Empty tuple
my_tuple = ()
print(my_tuple) # ()

# Tuple having integers
my_tuple = (1, 2, 3)
print(my_tuple) # (1, 2, 3)

# tuple with mixed datatypes
my_tuple = (1, "Hello", 3.4)
print(my_tuple) # (1, 'Hello', 3.4)

# nested tuple
my_tuple = ("mouse", [8, 4, 6], (1, 2, 3))
print(my_tuple) # ('mouse', [8, 4, 6], (1, 2, 3))
print(my_tuple[0]) # 'mouse'
print(my_tuple[1]) # [8, 4, 6]
print(my_tuple[2]) # (1, 2, 3)
print(my_tuple[1][1]) # 4

print("====================")
my_tuple = 3, 4.6, "dog"
print(my_tuple) # (3, 4.6, 'dog')

my_tuple = ("hello")
print(type(my_tuple))  # <class 'str'>

my_tuple = (10)
print(type(my_tuple)) # <class 'int'>

# Negative Indexing
my_tuple = ('p', 'e', 'r', 'm', 'i', 't')
print(my_tuple[-1]) # t
print(my_tuple[-3]) # m





