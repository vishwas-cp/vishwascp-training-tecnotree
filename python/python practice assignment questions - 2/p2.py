# Write a program that takes a string and returns a new string with all the
# vowels removed.

def vowels(s1):
    vowels = "aeiouAEIOU"
    return "".join([char for char in s1 if char not in vowels])

user_input = input("Enter a string: ")
new_str = vowels(user_input)
print("String without vowels:", new_str)
