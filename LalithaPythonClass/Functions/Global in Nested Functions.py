import LalithaPythonClass.Functions.config

def foo():
    x = 20

    def bar():
        global x
        x = 25

    print("Before calling bar: ", x)
    print("Calling bar now")
    bar()
    print("After calling bar: ", x)


foo()
print("x in main: ", x)

# Before calling bar:  20
# Calling bar now
# After calling bar:  20
# x in main:  25
