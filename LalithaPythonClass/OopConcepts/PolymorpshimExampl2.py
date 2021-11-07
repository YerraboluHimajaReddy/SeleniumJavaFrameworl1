from LalithaPythonClass.OopConcepts.PolymorpshimExample1 import PolymorphismParrot


class PolymorphismPenguin:

    def fly(self):
        print("Penguin can't fly")

    def swim(self):
        print("Penguin can swim")

# common interface
def flying_test(bird):
    bird.fly()

#instantiate objects
parrot = PolymorphismParrot()
peggy = PolymorphismPenguin()

# passing the object
flying_test(parrot)
flying_test(peggy)

# Parrot can fly
# Penguin can't fly



