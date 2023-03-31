# Write a program that takes a list of numbers and returns a new list with
# only the prime numbers.


def is_prime(number):
    if number < 2:
        return False
    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            return False
    return True

def find_prime_numbers(number_list):
    return [num for num in number_list if is_prime(num)]

user_input = input("Enter a list of numbers separated by spaces: ")
number_list = list(map(int, user_input.split()))
prime_numbers = find_prime_numbers(number_list)
print("Prime numbers in the list:", prime_numbers)
