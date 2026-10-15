# Java Fundamentals – Assignment 1

## Project Overview
This repository contains four Java programming tasks completed as part of the **Programming Fundamentals and Database** course at **Vilnius College of Design (VCD)**.

The purpose of this assignment is to practice basic Java programming concepts, including variables, data types, mathematical operations, user input, and conditional statements.

Each task is implemented in a separate Java package.

## Assignment Tasks

### Task 1 – Library Books
**Package:** `task1`  
**File:** `LibraryBooks.java`

Calculates the average number of books read per year by one library visitor using the average monthly number of books and the annual number of visitors.

**Formula:** `k = (v * 12) / n`

### Task 2 – Floor Tiles
**Package:** `task2`  
**File:** `FloorTiles.java`

Calculates the total cost of floor tiles based on room length, width, and tile price per square metre. An additional 5% is included for waste or damage.

**Formula:** `Total Cost = Length * Width * Price * 1.05`

### Task 3 – Rectangle
**Package:** `task3`  
**File:** `Rectangle.java`

Calculates the area and perimeter of a rectangle using the coordinates of two opposite corners.

**Formulas:**
- `Area = Width * Height`
- `Perimeter = 2 * (Width + Height)`

### Task 4 – Triangle
**Package:** `task4`  
**File:** `Triangle.java`

Calculates the area of a triangle using three side lengths and Heron's formula. The program also checks whether the given sides form a valid triangle.

**Formulas:**
- `s = (a + b + c) / 2`
- `Area = sqrt(s * (s-a) * (s-b) * (s-c))`

## Technologies Used
- Java
- IntelliJ IDEA
- Maven
- Git and GitHub

## How to Run
1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Navigate to `src/main/java`.
4. Open the required task package.
5. Run the Java class using its `main()` method.
6. Enter the requested values in the console.

## Project Structure

```text
src/main/java/
├── task1/
│   └── LibraryBooks.java
├── task2/
│   └── FloorTiles.java
├── task3/
│   └── Rectangle.java
└── task4/
    └── Triangle.java
```

## Author
**Ahsanul Islam**  
Vilnius College of Design (VCD)  
Program: Smart Automation Industries – Robotics Programming System

## Course
Programming Fundamentals and Database

**Assignment:** 1
