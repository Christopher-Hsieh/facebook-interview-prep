## Optimize and Solve

#### #1 Look for BUD
- __B__ottlenecks
- __U__nnecessary work
- __D__uplicated work

These are 3 common things we waste time doing in an algorithm

#### #2 DIY (Do It Yourself)
- Get a really big example and try and see how you would solve it intuitively.
Just like finding permutations of one string in another problem:
- S: abbc
- B: cbabadcbbabbcbabaabccbabc

#### #3 Simplify and Generalize
- Break down the problem into multiple parts
- Give yourself simpler contraints, solve, then revisit original problem

#### #4 Base Case and Build
- Solve for n=1
- Okay now what if n=3? n=4?
- Permutations of a string problem:
  - Case 1: "a" --> {"a"}
  - Case 2: "ab" --> {"ab", "ba"}
  - Case 3: "abc" --> ?
  
#### #5 Data Structure Brainstorm
- Linked List? Well what if access and sorting are needed
- Array? Maybe, but we started with an array
- Binary tree? 
- Heap? Do we need to track min and max?


#### Remember that BCR (Best Conceivable Runtime) matters
#### Then check on space complexity (if not already)

#### Remember:
1. Correct
2. Efficent
3. Simple
4. Readable
5. Maintainable

### Never, Never Give Up
