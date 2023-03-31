# Write a program that takes a list of strings and returns a new list with all the
# strings sorted in alphabetical order.


def sort_strings(string_list):
    return sorted(string_list)

user_input = input("Enter a list of strings separated by spaces: ")
string_list = user_input.split()
sorted_list = sort_strings(string_list)
print("Sorted list of strings:", sorted_list)
