# Write a program that takes a list of strings and returns a new list with only
# the strings that are palindromes.


def is_palindrome(string):
    return string == string[::-1]

strings = input("Enter a list of strings separated by spaces: ").split()

palindromes = [string for string in strings if is_palindrome(string)]

print("Palindromes:", palindromes)
