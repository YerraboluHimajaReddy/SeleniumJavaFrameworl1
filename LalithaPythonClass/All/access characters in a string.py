#Accessing string characters in Python
str = 'programiz'
print('str = ', str) # str =  programiz

#first character
print('str[0] = ', str[0]) # str =  p

#last character
print('str[-1] = ', str[-1]) # str[-1] =  z
print('str[-1] = ', str[-5]) # str[-1] =  r

#slicing 2nd to 5th character
print('str[1:5] = ', str[1:5]) # str[1:5] =  rogr

print('str[1:] = ', str[1:]) # str[1:] =  rogramiz

#slicing 6th to 2nd last character
print('str[5:-2] = ', str[5:-2]) # str[5:-2] =  am
print('str[5:-1] = ', str[5:-1]) # str[5:-1] =  ami

#print(str[15]) #  print(str[15]) , IndexError: string index out of range

# print(str[1.5]) #  print(str[1.5]), TypeError: string indices must be integers
