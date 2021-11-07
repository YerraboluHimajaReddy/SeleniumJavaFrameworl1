from builtins import print


class Person:
    "This is a person class"
    age = 10

    def greet(self):
        print('Hello')


print(Person.age)#10
Person.greet("")#Hello

print(Person.greet)#<function Person.greet at 0x000000000118FAE8>
print(Person.__doc__) #This is a person class
