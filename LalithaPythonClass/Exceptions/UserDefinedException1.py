# define Python user-defined exceptions
class Error(Exception):
    """Base class for other exceptions"""
    pass

class SalaryNotINRange(Exception):
    """Base class for other exceptions"""
    pass


class ValueTooSmallError(Error):
    """Raised when the input value is too small"""
    pass


class ValueTooLargeError(Error):
    """Raised when the input value is too large"""
    pass

# you need to guess this number
number = 10000

# user guesses a number until he/she gets it right
while True:
    try:
        i_num = int(input("Enter a number: "))
        if i_num < number:
            raise SalaryNotINRange
        #elif i_num > number:
           # raise ValueTooLargeError
        break
    except ValueTooSmallError:
        print("This value is too small, try again!")
        print()
    except ValueTooLargeError:
        print("This value is too large, try again!")
        print()
    except SalaryNotINRange:
        print(" PLease enter salary is more than 10000")

    print("Congratulations! You guessed it correctly.")



# Enter a number: 9000
#  PLease enter salary is more than 10000
# Congratulations! You guessed it correctly.

