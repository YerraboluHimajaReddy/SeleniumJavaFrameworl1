class ComplexNumber:

    # constuctor method paramaterized
    def __init__(self, r=0, i=0):
        self.real = r
        self.imag = i
        print(" R value is : " , self.real , " i value is :",self.imag )

    def __init__(self, r=0, i=0,j=0):
        self.real = r
        self.imag = i
        self.j = j
        print(" R value is : " , self.real , " i value is :",self.imag , "j value is :" , j)

    def get_data(self):
        print('{self.real}+{self.imag}j')

complex=ComplexNumber(5,6)
complex1=ComplexNumber(5,6,7)
complex.get_data() #{self.real}+{self.imag}j

print("========================")
# Create another ComplexNumber object
# and create a new attribute 'attr'
num2 = ComplexNumber()#R value is :  0  i value is : 0


print("=====================")
num2 = ComplexNumber(5) # R value is :  5  i value is : 0
num2.attr = 10

print((num2.real, num2.imag, num2.attr)) #(5, 0, 10)

print("=====================")
num2 = ComplexNumber(5,6) # R value is :  5  i value is : 6
num2.attr = 10

print((num2.real, num2.imag, num2.attr)) #(5, 6, 10)

print("=====================")
# the below code will get error
num2.attr = 10
num2 = ComplexNumber()

#print((num2.real, num2.imag, num2.attr))  # 'ComplexNumber' object has no attribute 'attr'




