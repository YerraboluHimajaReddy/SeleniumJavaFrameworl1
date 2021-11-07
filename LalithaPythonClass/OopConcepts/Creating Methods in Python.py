class Parrot:

    # instance attributes
    def __init__(self, name, age):
        self.name = name
        self.age = age
        print("name is: ", self.name, "age is :" ,self.age)

    # instance method
    def sing(self, song):
        return "{} sings {}".format(self.name, song)

    def dance(self):
        return "{} is now dancing".format(self.name)




lalitha=Parrot("Parrot",3)
lalitha.sing("cucucucu")
# call our instance methods
print(lalitha.sing("'Happy'"))
print(lalitha.dance())
