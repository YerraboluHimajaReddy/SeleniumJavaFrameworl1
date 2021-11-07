digits = [0, 1, 5, "Himaja"]

for i in digits:
    print(i)
else:
    print("No items left.")

#0
#1
#5
#Himaja
#No items left.

print("===================")
# program to display student's marks from record
student_name = 'Soyuj'

marks = {'Soyuj': 80, 'Soyuj': 55, 'Soyuj': 54, 'HimajaSoyuj': 57}

for student in marks:
    if student == student_name:
        print(marks[student]) #90
        break
else:
    print('No entry with that name found.')

