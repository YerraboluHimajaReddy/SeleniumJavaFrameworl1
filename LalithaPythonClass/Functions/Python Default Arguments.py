def greet(name, msg="Good morning!"):
    """
    This function greets to
    the person with the
    provided message.

    If the message is not provided,
    it defaults to "Good
    morning!"
    """

    print("Hello", name + ', ' + msg)


greet("Lalitha")
greet("Lalitha","Have a nice day")
print(greet.__doc__)

#def greet(msg = "Good morning!",name): # SyntaxError: non-default argument follows default argument
def greet(name,msg = "Good morning!"):
    pass