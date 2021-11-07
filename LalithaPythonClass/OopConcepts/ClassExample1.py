class Parrot:
    print(" I am in class Parrot ")
    # class attribute
    species = "bird"
    # Creating a method
    def Birdproperty(self, name, age):
        self.name = name
        self.age = age
        print(self.age, self.name)




parrotobj = Parrot()
parrotobj.Birdproperty("Blue",2)

# I am in class Parrot
# 2 Blue
