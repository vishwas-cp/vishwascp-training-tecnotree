
# To-Do List App:


def add_task(tasks):
    task = input("Enter a task: ")
    tasks.append(task)
    print("Task added successfully!")

# Function to view all the tasks in the list
def view_tasks(tasks):
    if len(tasks) == 0:
        print("No tasks in the list.")
    else:
        print("Tasks:")
        for index, task in enumerate(tasks):
            print(f"{index + 1}. {task}")

# Function to remove a task from the list
def remove_task(tasks):
    if len(tasks) == 0:
        print("No tasks in the list.")
    else:
        view_tasks(tasks)
        task_number = int(input("Enter the task number to remove: "))
        if task_number < 1 or task_number > len(tasks):
            print("Invalid task number. Please try again.")
        else:
            removed_task = tasks.pop(task_number - 1)
            print(f"Task '{removed_task}' removed successfully!")

# Function to save the tasks to a file
def save_tasks_to_file(tasks, filename):
    with open(filename, 'w') as file:
        for task in tasks:
            file.write(task + '\n')
    print("Tasks saved successfully!")

# Function to load the tasks from a file
def load_tasks_from_file(filename):
    tasks = []
    try:
        with open(filename, 'r') as file:
            for line in file:
                tasks.append(line.strip())
        print("Tasks loaded successfully!")
    except FileNotFoundError:
        print("File not found. No tasks loaded.")
    return tasks

# Function to display the menu options
def display_menu():
    print("1. Add task")
    print("2. View tasks")
    print("3. Remove task")
    print("4. Save tasks to file")
    print("5. Load tasks from file")
    print("6. Exit")

# Main function to run the program
def main():
    tasks = []
    while True:
        display_menu()
        choice = int(input("Enter your choice: "))
        if choice == 1:
            add_task(tasks)
        elif choice == 2:
            view_tasks(tasks)
        elif choice == 3:
            remove_task(tasks)
        elif choice == 4:
            filename = input("Enter the filename to save the tasks to: ")
            save_tasks_to_file(tasks, filename)
        elif choice == 5:
            filename = input("Enter the filename to load the tasks from: ")
            tasks = load_tasks_from_file(filename)
        elif choice == 6:
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == '__main__':
    main()
