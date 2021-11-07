class Parrot:

    # class attribute
    species = "bird"
    birdname="Parrot"

    # instance attribute
    def __init__(self, name, age):
        self.name = name
        self.age = age
        print(self.name, self.age)

# instantiate the Parrot class
blu = Parrot("Blue", 10)
woo = Parrot("Woo", 15)

# access the class attributes/variables
print("Blu is a {}".format(blu.__class__.species))
print("Woo is also a {}".format(woo.__class__.species))
print("Blu is a {}".format(blu.__class__.birdname))


# access the instance attributes
print("{} is {} years old".format( blu.name, blu.age))
print("{} is {} years old".format( woo.name, woo.age))


# Blue 10
# Woo 15
# Blu is a bird
# Woo is also a bird
# Blu is a Parrot
# Blue is 10 years old
# Woo is 15 years old

