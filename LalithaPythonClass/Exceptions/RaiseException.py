try:
    a = int(input("Enter a positive integer: "))
    if a <= 0:
        raise ValueError("That is not a positive number!")
except ValueError as ve:
          print(ve)

# Enter a positive integer:  2
#
# Process finished with exit code 0

# Enter a positive integer: -1
# That is not a positive number!