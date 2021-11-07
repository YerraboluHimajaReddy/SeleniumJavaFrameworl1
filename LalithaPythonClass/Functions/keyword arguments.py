# 2 keyword arguments
def greet(name = "Bruce",msg = "How do you do?") :
    print(name,msg)

greet()



# 2 keyword arguments (out of order)
def greet1(msg = "How do you do?",name = "Bruce"):
    print(msg,name)

greet1()
#greet(name="Bruce","How do you do?")#SyntaxError: non-keyword arg after keyword arg