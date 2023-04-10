# Write a program that takes a list of numbers and returns a new list with the
# elements squared.


def square_numbers(number_list):
    return [num**2 for num in number_list]

user_input = input("Enter a list of numbers separated by spaces: ")
number_list = list(map(int, user_input.split()))
squared_numbers = square_numbers(number_list)
print("Squared numbers:", squared_numbers)
