from LalithaPythonClass.Polymorphism.Cat import Cat


class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        print("In Dog Class Constructor method")

    # overriding methods
    def info(self):
        print("I am a Dog. My name is :",self.name ," I  am ", self.age ,"years old.")

    def make_sound(self):
        print("Bark")

cat1 = Cat("Kitty", 2.5)
dog1 = Dog("Fluffy", 4)

for animal in (cat1, dog1):
    animal.make_sound()
    animal.info()
    animal.make_sound()

# output:
# In Cat Class Constructor method
# In Dog Class Constructor method
# Meow
# I am a cat. My name is : Kitty  I  am  2.5 years old.
# Meow
# Bark
# I am a Dog. My name is : Fluffy  I  am  4 years old.
# Bark

