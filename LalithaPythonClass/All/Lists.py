# empty list
my_list = []
print(my_list) # []

# list of integers
my_list = [1, 2, 3, 2,2 ,2 ]
print(my_list) # [1, 2, 3]
# list with mixed data types
my_list = [1, "Hello", 3.4] # [1, 'Hello', 3.4]
print(my_list)

My_list1=['c',"Hello",3.4,3] # ['c', 'Hello', 3.4, 3]
print(My_list1)

# nested list : a list inside is list is called nested list
my_list = ["mouse", [8, 4, 6], ['a'], ["String", 'c',3.4]] # ['mouse', [8, 4, 6], ['a']]
print(my_list)
print(my_list[0]) # mouse
print(my_list[1]) #[8, 4, 6]
print(my_list[2]) # ['a']
print(my_list[1][0])  # 8
print(my_list[1][1]) # 4
print(my_list[1][2]) # 6
print(my_list[3]) # ['String', 'c', 3.4]
print(my_list[3][1]) # c
#print(my_list[3.0]) # print(my_list[3.0]) : list indices must be integers or slices, not float

print("=================")
# negative indexing
print(my_list[-1]) # ['String', 'c', 3.4]
print(my_list[-4]) # mousex

