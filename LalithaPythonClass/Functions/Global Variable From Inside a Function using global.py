c = 0 # global variable

def add():
    global c
    print(c) #0
    c = c + 2 # increment by 2
    print("Inside add():", c) #Inside add(): 2

add()
print("In main:", c) #In main: 2
