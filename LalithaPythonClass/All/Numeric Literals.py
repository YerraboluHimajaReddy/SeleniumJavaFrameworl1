

# Interger Literal
from itertools import product

a = 0b1010 #Binary Literals
b = 100 #Decimal Literal
c = 0o310 #Octal Literal
d = 0x12c #Hexadecimal Literal


print(a) # 10
print(b) # 100
print(c) # 200
print(d) # 300

#Float Literal
float_1 = 10.5
float_2 = 1.5e2
float_3 = 1.5e3

print(float_1) # 10.5
print(float_2) #  1.5 * (10*10)  =150.0
print(float_3) # 1500.0

#Complex Literal
x = 3.14j

print(x, x.imag, x.real) # 3.14j , 3.14 , 0.0