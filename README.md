<details>
  <summary>CS211 Group Prelim Project 📘 </summary>
  | Author: Leonhard Leung <br>
  | Course: CS211 <br>
  | Class Code: 9342
</details>

## Description
This project is a part of our Data Structures course prelims. It focuses on implementing three sorting algorithms (bubble, insertion, and selection sort) and analyzing their performance on various datasets. The goal is to measure the number of statements executed during sorting for different dataset variations.

## Project Structure
- `src/` contains the source code for the sorting algorithms.
- `data/` stores the datasets in varying sizes and variations (ascending, random, descending).

## Objectives
- __Sorting Algorithms:__ Develop a program that implements three classic sorting algorithms: bubble, insertion, and selection sort. Each algorithm should be encapsulated within its own class.
- __Sorting Interface Implementation:__ Implement a common sorting interface or base class that these sorting classes inherit from. This ensures a consistent and interchangeable approach to sorting.
- __Data Set Preparation:__ Prepare five distinct data sets with varying sizes: 10k, 50k, 200k, 500k, and 1m records. Each data set should have three variations:
  * Best Case: Data arranged in ascending order.
  * Average Case: Data arranged randomly.
  * Worst Case: Data arranged in descending order.
- __Sorting Execution:__ Execute each of the implemented sorting algorithms on the prepared data sets, measuring the number of statements executed during each sorting operation.
- __Results Display: Provide a clear and comprehensive display of the total number of statements executed for each sorting algorithm and dataset variation.

## Usage
To run the sorting algorithms on a specific dataset, follow these steps:
1. Go to the Executable.java class. (the executable class of the program)
2. In the run method, there is a nested for loop. simply change the number of the for loops. (A number guide is added as a comment before the loop)

## Task Checklist
- [x] `Data Files` : Directory containing all csv files organized in sub-folders per data set
- [x] `ArrayMaker.java` : Class used to handle the creation and population of arrays
- [x] `FileNames.java` : Class used to set the path of each csv file to be read by the executable class
- [x] `BubbleSort.java` : Class containing the bubble sort algorithm and implements the sorter interface
- [x] `InsertionSort.java` : Class containing the insertion sort algorithm and implements the sorter interface
- [x] `SelectionSort.java` : Class containing the selection sort algorithm and implements the sorter interface
- [x] `Sorter.java` : Interface to be implemented by the sorting classes
- [x] `Executable.java` : Executable class that outputs the execution times of each sorting method with the given data sets

## Deliverabels
> Technical Report <br>
> Java Programs <br>
> Recorded Video Presentation <br>
> Accomplished Peer Evaluation Form
