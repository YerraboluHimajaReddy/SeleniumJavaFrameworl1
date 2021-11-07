from builtins import print

try:
    file = open("C:\\Users\\Sony\\Desktop\\test.txt", encoding='utf-8')
    # perform file operations
finally:
   print(" file is not there in the system")
   file.close()

   # Traceback (most recent call last):
#   File "C:/Users/Sony/PycharmProjects/LalithaClass/LalithaPythonClass/Exceptions/ExceptionTryFinally.py", line 7, in <module>
#     file = open("C:\\Users\\Sony\\Desktop\\test.txt", encoding='utf-8')
# FileNotFoundError: [Errno 2] No such file or directory: 'C:\\Users\\Sony\\Desktop\\test.txt'
#
# During handling of the above exception, another exception occurred:
#
# Traceback (most recent call last):
#   File "C:/Users/Sony/PycharmProjects/LalithaClass/LalithaPythonClass/Exceptions/ExceptionTryFinally.py", line 10, in <module>
#     file.close()
# NameError: name 'file' is not defined
