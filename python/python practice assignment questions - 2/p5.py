# Write a program that takes two lists of numbers and returns a new list with
# the elements that appear in both lists.


def find_common_elements(list1, list2):
    return list(set(list1) & set(list2))

user_input1 = input("Enter the first list of numbers separated by spaces: ")
list1 = list(map(int, user_input1.split()))
user_input2 = input("Enter the second list of numbers separated by spaces: ")
list2 = list(map(int, user_input2.split()))

common_elements = find_common_elements(list1, list2)
print("Common elements in both lists:", common_elements)
