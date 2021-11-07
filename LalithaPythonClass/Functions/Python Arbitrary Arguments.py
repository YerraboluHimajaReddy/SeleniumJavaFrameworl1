def greet(*values):
    """This function greets all
    the person in the names tuple."""

    # names is a tuple with arguments
    for name in values:
        print("Hello", name)


greet("Monica", "Luke", "Steve", "John",5)

# Hello Monica
# Hello Luke
# Hello Steve
# Hello John
# hello 5