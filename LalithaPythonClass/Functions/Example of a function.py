
def greet(name, age):
    """
    This function greets to
    the person passed in as
    a parameter
    """
    print("Hello, " + name + ". Good morning!" ," your age is : ", age)

greet("Himaja",35)
greet("Lalitha",35)
print(greet.__doc__)

#greet("Himaja") # greet() missing 1 required positional argument: 'age'
#greet() #greet() missing 2 required positional arguments: 'name' and 'age'