from LalithaPythonClass.Inheritance.Polygon import Polygon

# if u want to call parent class constructor we should create constructor in the child class and call the parent constructor method in the child class constructor method
class Name(Polygon):
   # def __init__(self):
    #    super().__init__(self,1)
   def __init__(self):
       Polygon.__init__(self, 3)

tri=Name()
