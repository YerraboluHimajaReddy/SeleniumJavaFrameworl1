# Dictionary Methods
marks = {}.fromkeys(['Math', 'English', 'Science'], 0)
marks1 = {}.fromkeys(['Math', 'English', 'Science'], 1)

print(marks) #{'English': 0, 'Science': 0, 'Math': 0}
print(marks1) #{'English': 1, 'Science': 1, 'Math': 1}

for item in marks.items():
    print(item)

    #('Math', 0)
    #('English', 0)
    #('Science', 0)

