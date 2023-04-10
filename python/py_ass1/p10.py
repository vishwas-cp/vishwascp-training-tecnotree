
num_list = input("Enter a list of numbers, separated by spaces: ").split()

num_list = [int(num) for num in num_list]

even_sum = 0
for num in num_list:
    if num % 2 == 0:
        even_sum += num

print("The sum of the even numbers in the list is:", even_sum)
