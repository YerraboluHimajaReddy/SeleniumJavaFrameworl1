class C:
    def __init__(self):
        print('Constructor called.')

    def see(self):
        print('C')

lalitha=C()
himaja=C()
classa=C()
# output: it print 3 times the constructor method because we are creating 2  objects
# Constructor called.
# Constructor called.
# Constructor called.

print("======================")
lalitha.see() # C
# construcor belongs to class, constructor created when class is created and constructor dleted when class is deleetd in the method
# method belongs to object, method created when object is creaated and method deleted when object is deletes


