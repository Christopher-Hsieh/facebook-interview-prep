##### review
Extra
- 12.1 - permutations with +/-| 3. possible do robot question

| Index | Question        | Question 2 | Notes           | Done  | Times Asked |
| - | -------------------------------------------------------- |:-----:| ---------------------:| -----:| -----:|
| 1 | Given the alphabet encoded as numbers (e.g., a=1, b=2, ..., z=26), and a sequence of numbers (e.g., "23413259802"), how many strings can be generated.  | Can it be done with DP? | Done using recursion or dynamic programming, careful of edge cases | yes - partially | 2|
| 2 | Write a C function to merge two sorted linked lists  | | |
| 3 | Print all permutations of a given string. &  Given a 2D array of characters ('-' , 'X' , 'R' , 'T   '), find out whether there is a path from the robot 'R' to the target 'T'. The robot can move up, down, left or right. Cells marked with 'X' are blocked and cannot be passed through. |  | recursion for string permutations. 0 - string length. Perform a swap and then swap back |
| 4 | Do an in-place (without allocating any extra memory) rearrangement of a list of integers, putting non-zero elements first. | | |
| 5 | Design and write code for a queue system which would include enqueue, dequeue, etc. | | |
| 6 | Given an array of integers find the sum of k largest integers in that array. | | implement a max heap, remove max K times. Note, a max heap is not a sorted BST, only semi sorted. Just know that if root index = 1, children = 2i & 2i+1 parent is floor(i/2). if root index = 0, children = 2i+1, 2i+2 & parent = floor((i-1)/2)  | done |
| 7 | Given Binary Tree is Binary Search tree or not.  Write code to check if a BST is valid or not. | | | | 3|
| 8 | Write a program to detect conflicts in meeting schedules  | | | | 2|
| 9 | If your are given an Integer Singly linked list. Print it backwards.  | Constraints: 1. Do not manipulate the list. (example: do not make it a doubly linked list, do not add or delete elements, do not change any memory location of any element) 2. O(n) < time < O(n^2) 3. O(1) < space < O(n) | |
| 10 | Search for an item in a sorted, but rotated, array. | | Modified version of binary search |
| 11 | Max occurrence letter in a string. [Kept on adding constraints like ignore spaces, special characters, case insensitive..] Later asked about space and time complexities  | | bucket sort |
| 12 | Parse a string containing numbers and "+", "-" and parentheses. Evaluate the expression. -2+(3-5) should return -4.  |  Balance parenthesis type problem  | | | 2 |
| 12.1 | 1. You have a string consisting of open and closed   parentheses, but parentheses may be imbalanced. Make the parentheses balanced and return the new string. | 2. You have a string of numbers, i.e. 123. You can insert a + or - sign in front of ever number, or you can leave it empty. Find all of the different possibilities, make the calculation and return the sum. For example; +1+2+3 = 6 +12+3 = 15 +123 = 123 +1+23 = 24 ... -1-2-3 = 6 ... Return the sum of all the results. 3. How do you design google search auto complete? 4. Classic behavioral questions | Use stack to balance parantheses | | 2 |
| 13 | Sum of contiguous array elements  | | |


| Question        | Notes           | Done  |
| -------------------------------------------------------- |:-------------:| -----:|
| Given a string break it up into meaningful sentence "thesystemisrunning" => the system is running    | | |
| Given a million a million integers find the kth smallest    | | |
| 1. Implement iterator that increments over K sorted arrays in increasing order. 2. Number pad combinations problem.    | | |
| Given an array of integers find a contiguous subset that sums to a given number    | | |
| Give tasks of diferrent kinds and a cooldown time. Tasks of same kind must be separated by at least cooldown time to executed.   | | | 
