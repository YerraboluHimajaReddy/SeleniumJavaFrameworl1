# child class
from LalithaPythonClass.OopConcepts.Bird import Bird

class Penguin(Bird):

    def __init__(self):
        # call super() function
        super().__init__()
        super().whoisThis()
        print("Penguin is ready")

    def whoisThis(self):
        print("Penguin")
    def swim(self):
        print("penguin Swim faster")

    def run(self):
        print("Penguin Run faster")

peggy = Penguin()
peggy.whoisThis()
peggy.swim()
peggy.run()


# Penguin is ready
# Penguin
# Swim faster
# Penguin Run faster

# Bird is ready
# Bird
# Penguin is ready
# Penguin
# penguin Swim faster
# Penguin Run faster
