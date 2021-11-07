from builtins import print

print("PrOgRaMiZ".lower()) # programiz
print("PrOgRaMiZ".upper()) # PROGRAMIZ
print("This will split all words into a list".split()) # ['This', 'will', 'split', 'all', 'words', 'into', 'a', 'list']
#print("This will split all words into a list".split(0)) #  Can't convert 'int' object to str implicitly

print(' '.join(['This', 'will', 'join', 'all', 'words', 'into', 'a', 'string'])) # This will join all words into a string
print('Happy New Year'.find('ew')) # 7
print('Happy New Year'.find('r')) # 13
print('Happy New Year'.replace('Happy','Brilliant')) # Brilliant New Year