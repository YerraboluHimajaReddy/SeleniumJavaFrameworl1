
b=100
def greet(name):
    # local variable : the scope of the local variable is for the method only, we cannot access teh variable outside the variable, it will show complie time error if u use local variables outside the block
    a=10
    """
    This function greets to
    the person passed in as
    a parameter
    """
    print("Hello, " + name + ". Good morning!")
    return name

greet("Himaja")
print(greet("Himaja"))
print(b)
