class Cat:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        print("In Cat Class Constructor method")

    def info(self):
        print("I am a cat. My name is :",self.name ," I  am ", self.age ,"years old.")

    def make_sound(self):
        print("Meow")
