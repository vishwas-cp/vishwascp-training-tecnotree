# Write a program that takes a list of numbers and returns the median value.


def calculate_median(numbers):
    n = len(numbers)
    sorted_numbers = sorted(numbers)
    if n % 2 == 0:
        middle_index = n // 2
        median = (sorted_numbers[middle_index - 1] + sorted_numbers[middle_index]) / 2
    else:
        middle_index = n // 2
        median = sorted_numbers[middle_index]
    return median

user_input = input("Enter a list of numbers, separated by commas: ")
number_list = [int(n) for n in user_input.split(",")]
median = calculate_median(number_list)
print("The median value of the list is:", median)
