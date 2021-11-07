drink = "Available"


food =None

def menu(x):
    if x == drink:
        print(drink) # Available
    else:
        print(food) # None

menu(drink)
menu(food)
