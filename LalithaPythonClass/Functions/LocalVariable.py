
#x=20
def my_func():
	# here x is a local variable
	x=10
	print("Value inside function:",x)

# here x is a global variable
x=15
my_func()
print("Value outside function:",x)
