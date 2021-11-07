class Computer:

    # parameterized construcor
    def __init__(self, name, speed):
        self.name = name
        self.speed = speed
        print(" name is :" , self.name, "speed is :", self.speed)
   # def __init__(self, name,speed, age):
   #     self.name = name
   #     self.speed = speed
   #     self.age = age
   #     print(" name is :" , self.name, "speed is :", self.speed, "age is :", self.age)

# here i am creating 4 objects for the same class
com=Computer("Lalitha",10) # name is : Lalitha speed is : 10
apple = Computer('Apple',100) # name is : Apple speed is : 100
iphone = Computer('Apple iOS', 10) #name is : Apple iOS speed is : 10
watch = Computer('Watch', 1) #name is : Watch speed is : 1

