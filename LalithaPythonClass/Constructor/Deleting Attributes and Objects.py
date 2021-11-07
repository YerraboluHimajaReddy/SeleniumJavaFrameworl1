from itertools import product


class ComplexNumber:
    def __init__(self, r=0, i=0):
        self.real = r
        self.imag = i
        print(" R value is : " , self.real , " i value is :",self.imag )

    def get_data(self):
        print('{self.real}+{self.imag}j')

complex=ComplexNumber(5,6) #R value is :  5  i value is : 6
del complex.imag
# the below code will get error as we have deletd the image attribute in the above line
#print(complex.imag) # 'ComplexNumber' object has no attribute 'imag'

print("================================")
del ComplexNumber.get_data
#complex.get_data() # 'ComplexNumber' object has no attribute 'get_data'

print("========================")
# before deleting the object
print(complex.real) # 4
del complex
# after delecting the object
print(complex.real) #<member 'real' of 'complex' objects>