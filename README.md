[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Qz0muc8V)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22706698)
# Unit 1 Java Programming Project

This project is designed APCS-A, focusing on Unit 1 concepts such as primitive data types, variable declaration, operators, and casting. The project includes a set of methods that students need to implement, along with unit tests to verify their functionality.

## Project Structure

- **`Unit1.java`**: Contains method headers and task descriptions. Students are required to implement the method bodies.
- **`Unit1Test.java`**: JUnit test cases for each method in `Unit1.java`. These tests validate the correctness of the implemented methods.
- **`pom.xml`**: Maven configuration file that manages dependencies and plugins required to build and run the project.

## Prerequisites

- Java 17 (or compatible version)
- Maven 3.x

## Getting Started

### Accept the Project

1. Navigate to our Canvas course for AP CS-A.
2. Find the assignment Unit 1 Programming Problems.
3. Click the link to go to GitHub Classroom
4. Accept the assignment in GitHub Classroom.

### Clone the Repository

Clone this repository to your local machine using GitHub Desktop or use GitHub Codespaces. [Directions can be found here.](https://github.com/hotdogontology/Java-Workflow)

### Run Tests

Run the JUnit tests to verify your implementations.

## Method Descriptions

Students need to implement the following methods in `Unit1.java`:

1. **`addIntegers(int a, int b)`**: Returns the sum of two integers.
2. **`castDoubleToInt(double value)`**: Converts a double to an integer by casting.
3. **`isTrue(boolean value)`**: Returns `true` if the boolean parameter is true, otherwise returns `false`.
4. **`maxValueMinusOne()`**: Returns the maximum integer value (`Integer.MAX_VALUE`) minus one.
5. **`multiplyIntAndDouble(int a, double b)`**: Returns the product of an integer and a double as a double.

## Common Mistakes to Avoid

- Forgetting that Java is case-sensitive (e.g., `myScore` is not the same as `myscore`).
- Forgetting to specify the type when declaring a variable (e.g., using `name = value;` instead of `type name = value;`).
- Using a variable name without declaring the variable.
- Using the wrong name for a variable (e.g., declaring it as `studentTotal` but using `total` later).
- Using the wrong type for a variable, especially when using integer types in calculations that yield fractional results. Either cast one value to double or use a double variable.
- Using `==` to compare double values instead of testing if the absolute value of the difference between the values is below a certain threshold.
- Assuming 0 is smaller than other int values; use `Integer.MIN_VALUE` for the smallest possible int value.

## Acknowledgements

This project has been adapted from the repo generously shared by [Kevin Hare](https://csplusplus.com/). 

