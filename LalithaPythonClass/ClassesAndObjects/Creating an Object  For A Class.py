
class Person:
    "This is a person class"
    age = 10

    def greet(self):
        print('Hello')

# object declaration, here lalitha is a object name
# create a new object of Person class
lalitha=Person()
print(lalitha.age) # 10

print("===============================")
# below are not the best practices
# Output: <function Person.greet>
print(Person.greet) # <function Person.greet at 0x0000000000ADFAE8>

print(lalitha.greet) # <bound method Person.greet of <__main__.Person object at 0x00000000011D3B00>>

print("===========================")
lalitha.greet() # Hello