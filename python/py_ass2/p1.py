# Write a program that takes a list of numbers and returns the sum of
# all even numbers in the list.

def even(num1):
    even_sum = 0
    for num in num1:
        if num % 2 == 0:
            even_sum += num
    return even_sum

numbers = [20,30,40,50,60]
result = even(numbers)
print(even(numbers)) 
