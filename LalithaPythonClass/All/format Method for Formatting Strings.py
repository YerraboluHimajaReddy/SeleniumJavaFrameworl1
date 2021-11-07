# Python string format() method

# default(implicit) order
default_order = "{}, {} and {}".format('John','Bill','Sean')
print('\n--- Default Order ---') # --- Default Order ---
print(default_order) # John, Bill and Sean

# order using positional argument
positional_order = "{1}, {0} and {2}".format('John','Bill','Sean')
print('\n--- Positional Order ---') # --- Positional Order ---
print(positional_order) # Bill, John and Sean

# order using keyword argument
keyword_order = "{s}, {b} and {j}".format(j='John',b='Bill',s='Sean')
print('\n--- Keyword Order ---') # --- Keyword Order ---
print(keyword_order) # Sean, Bill and John

