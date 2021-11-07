class Polygon:

    #Parametrezied constructor method
    def __init__(self, no_of_sides):
        self.n = no_of_sides
        self.sides = [1 for i in range(no_of_sides)]

    def inputSides(self):
        self.sides = [float(input("Enter side " + str(i + 1) + " : ")) for i in range(self.n)]

    def dispSides(self):
        for i in range(self.n):
            print("Side",i+1,"is",self.sides[i])

poly=Polygon(1)
poly.inputSides()
poly.dispSides()

# output
# Enter side 1 : 100
# Side 1 is 100.0


