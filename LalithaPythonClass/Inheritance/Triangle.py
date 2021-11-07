from LalithaPythonClass.Inheritance.Polygon import Polygon

# if u want to call parent class constructor we should create constructor in the child class and call the parent constructor method in the child class constructor method
class Triangle(Polygon):
    def __init__(self):
        Polygon.__init__(self,3)

    def findArea(self):
        a, b, c = self.sides
        # calculate the semi-perimeter
        s = (a + b + c) / 2
        print(" s value is :", s)
        print((s * (s - a) * (s - b) * (s - c)) )
        area = (s * (s - a) * (s - b) * (s - c)) ** 0.5
        print('The area of the triangle is %0.2f' % area)

tri=Triangle()
tri.inputSides()
tri.findArea()
tri.dispSides()
print(isinstance(tri,Triangle)) # True
print(isinstance(tri,Polygon)) # True
print(isinstance(tri,int)) # False
print(isinstance(tri,object)) #True
print(issubclass(Polygon,Triangle)) # False
print(issubclass(Triangle,Polygon)) # True
print(issubclass(bool,int)) # True

# output:
# Enter side 1 : 1
# Side 1 is 1.0
# Enter side 1 : 1
# Enter side 2 : 1
# Enter side 3 : 1
#  s value is : 1.5
# 0.1875
# The area of the triangle is 0.43
# Side 1 is 1.0
# Side 2 is 1.0
# Side 3 is 1.0
