from LalithaPythonClass.Inheritance.ClassB import B
from LalithaPythonClass.Inheritance.ClassZ import Z
from LalithaPythonClass.Inheritance.ClassA import A


class M(B, A, Z):
    pass

print(M.mro())

# output:
# [<class '__main__.M'>, <class 'LalithaPythonClass.Inheritance.ClassB.B'>, <class 'LalithaPythonClass.Inheritance.ClassA.A'>, <class 'LalithaPythonClass.Inheritance.ClassX.X'>, <class 'LalithaPythonClass.Inheritance.ClassY.Y'>, <class 'LalithaPythonClass.Inheritance.ClassZ.Z'>, <class 'object'>]
