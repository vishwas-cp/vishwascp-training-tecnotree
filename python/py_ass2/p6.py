# Write a program that takes a list of words and returns the longest word in
# the list.


word_list = input("Enter a list of words separated by spaces: ").split()

longest_word = ""
for word in word_list:
    if len(word) > len(longest_word):
        longest_word = word

print("The longest word in the list is:", longest_word)
