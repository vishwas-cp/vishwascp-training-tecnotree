# Write a program that takes a string and returns the number of times each
# letter appears in the string.


string = input("Enter a string: ")
letter_count = {}

for letter in string:
    if letter in letter_count:
        letter_count[letter] += 1
    else:
        letter_count[letter] = 1

print("Letter counts:")
for letter, count in letter_count.items():
    print(letter, count)
