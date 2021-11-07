class Car:
    # default constructor
    def __init__(self):
        self.wheels = 4
        self.doors = 2
        self.chairs = 2

obj1 = Car()
obj2 = Car()

print(obj1.doors) # 2
print(obj2.doors) # 2
print(obj2.wheels) # 4