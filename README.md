# CodewarsExercises
Exercises to practice from codewars.com (https://www.codewars.com). There are different levels, from 8kyu (the easiest) to 1kyu (the hardest)

____________________________________

## 8kyu level exercises: index

Exercise 1:  Classic Hello World.

Exercise 2:  Collinearity

Exercise 3:  Powers of 2

Exercise 4: Rock Paper Scissors!

Exercise 5: Multiply the number

Exercise 6: Invert values

Exercise 7: Transportation on vacation

___________________________________________

## 7kyu level exercises: index

Exercise 8: Anagram Detection

Exercise 9: Basic Sequence Practice

Exercise 10: Growth of a Population

Exercise 11: Sum a list but ignore any duplicates

Exercise 12: Count the divisors of a number

Exercise 13: Ones and Zeroes

Exercise 14: Reverse Letters

Exercise 15: Check three and two

Exercise 16: Rotate for a Max

 ______________________________________


### Exercise 1:  Classic Hello World:
DESCRIPTION:
You are given a method called main, make it print the line Hello World!, (yes, that includes a new line character at the end) and don't return anything

Note that for some languages, the function main is the entry point of the program.
___________________________________
### Exercise 2:  Collinearity:
Theoretical Material
You are given two vectors starting from the origin (x=0, y=0) with coordinates (x1,y1) and (x2,y2). Your task is to find out if these vectors are collinear. Collinear vectors are vectors that lie on the same straight line. They can be directed in the same or opposite directions. One vector can be obtained from another by multiplying it by a certain number. In terms of coordinates, vectors (x1, y1) and (x2, y2) are collinear if (x1, y1) = (k*x2, k*y2) , where k is any number acting as a coefficient.

Notes
All vectors start from the origin (x=0, y=0).
Be careful when handling cases where x1, x2, y1, or y2 are zero to avoid division by zero errors.
A vector with coordinates (0, 0) is collinear to all vectors.
__________________________________________________
### Exercise 3:  Powers of 2:
DESCRIPTION:
Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).

Examples
n = 0  ==> [1]        # [2^0]

n = 1  ==> [1, 2]     # [2^0, 2^1]

n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
________________________________________________________________________
### Exercise 4: Rock Paper Scissors!
DESCRIPTION:
Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.
Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"

"scissors", "rock" --> "Player 2 won!"

"paper", "paper" --> "Draw!"
_______________________________________________________
### Exercise 5: Multiply the number
DESCRIPTION:
Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:

  3 -->    15  (  3 * 5¹)
  
 10 -->   250  ( 10 * 5²)
 
200 --> 25000  (200 * 5³)

  0 -->     0  (  0 * 5¹)
  
 -3 -->   -15  ( -3 * 5¹)
 ____________________________________________
### Exercise 6: Invert values

 Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

[1, 2, 3, 4, 5] --> [-1, -2, -3, -4, -5]

[1, -2, 3, -4, 5] --> [-1, 2, -3, 4, -5]

[] --> []

 __________________________________________
### Exercise 7: Transportation on Vacation

After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.

You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.

Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.

Write a code that gives out the total amount for different days(d).

___________________________________________

### Exercise 8: Anagram Detection

DESCRIPTION: An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

Examples

"foefet" is an anagram of "toffee"

"Buckethead" is an anagram of "DeathCubeK"
____________________________________

### Exercise 9: Basic Sequence Practice

DESCRIPTION:
A sequence or a series, in mathematics, is a string of objects, like numbers, that follow a particular pattern. The individual elements in a sequence are called terms. A simple example is 3, 6, 9, 12, 15, 18, 21, ..., where the pattern is: "add 3 to the previous term".

In this kata, we will be using a more complicated sequence: 0, 1, 3, 6, 10, 15, 21, 28, ... This sequence is generated with the pattern: "the nth term is the sum of numbers from 0 to n, inclusive".

[ 0,  1,    3,      6,   ...]

  0  0+1  0+1+2  0+1+2+3
  
Your Task: Complete the function that takes an integer n and returns a list/array of length abs(n) + 1 of the arithmetic series explained above. Whenn < 0 return the sequence with negative terms.

Examples

 5  -->  [0,  1,  3,  6,  10,  15]
 
-5  -->  [0, -1, -3, -6, -10, -15]

 7  -->  [0,  1,  3,  6,  10,  15,  21,  28]
 ________________________________________________________________

### Exercise 10: Growth of a Population

DESCRIPTION: In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town. How many years does the town need to see its population greater than or equal to p = 1200 inhabitants?

At the end of the first year there will be: 
1000 + 1000 * 0.02 + 50 => 1070 inhabitants

At the end of the 2nd year there will be: 
1070 + 1070 * 0.02 + 50 => 1141 inhabitants (** number of inhabitants is an integer **)

At the end of the 3rd year there will be:
1141 + 1141 * 0.02 + 50 => 1213

It will need 3 entire years.

More generally given parameters:

p0, percent, aug (inhabitants coming or leaving each year), p (population to equal or surpass)

the function nb_year should return n number of entire years needed to get a population greater or equal to p.

aug is an integer, percent a positive or null floating number, p0 and p are positive integers (> 0)


Examples:

nb_year(1500, 5, 100, 5000) -> 15

nb_year(1500000, 2.5, 10000, 2000000) -> 10

_______________________________________________


### Exercise 11: Sum a list but ignore any duplicates

DESCRIPTION: Please write a function that sums a list, but ignores any duplicated items in the list.
For instance, for the list [3, 4, 3, 6] the function should return 10, and for the list [1, 10, 3, 10, 10] the function should return 4.

______________________________________________________

### Exercise 12: Count the divisors of a number

DESCRIPTION: Count the number of divisors of a positive integer n.

Random tests go up to n = 500000.

Examples (input --> output)

4 --> 3 // we have 3 divisors - 1, 2 and 4

5 --> 2 // we have 2 divisors - 1 and 5

12 --> 6 // we have 6 divisors - 1, 2, 3, 4, 6 and 12

30 --> 8 // we have 8 divisors - 1, 2, 3, 5, 6, 10, 15 and 30

Note you should only return a number, the count of divisors. The numbers between parentheses are shown only for you to see which numbers are counted in each case.

______________________________________________________

### Exercise 13: Ones and Zeroes

DESCRIPTION: Given an array of ones and zeroes, convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:

Testing: [0, 0, 0, 1] ==> 1

Testing: [0, 0, 1, 0] ==> 2

Testing: [0, 1, 0, 1] ==> 5

Testing: [1, 0, 0, 1] ==> 9

Testing: [0, 0, 1, 0] ==> 2

Testing: [0, 1, 1, 0] ==> 6

Testing: [1, 1, 1, 1] ==> 15

Testing: [1, 0, 1, 1] ==> 11

However, the arrays can have varying lengths, not just limited to 4.

______________________________________________________

### Exercise 14: Reverse Letter

Given a string str, reverse it and omit all non-alphabetic characters.

Example

For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output

[input] string str

A string consists of lowercase latin letters, digits and symbols.

[output] a string

________________________________________________

### Exercise 15: Check three and two

DESCRIPTION: Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran), check if the array contains three and two of the same values.

Examples

["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"

["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"

["a", "a", "a", "a", "a"] ==> false // 5x "a"
____________________________________________________________

### Exercise 16: Rotate for a Max

Description: Let us begin with an example:

Take a number: 56789. Rotate left, you get 67895.

Keep the first digit in place and rotate left the other digits: 68957.

Keep the first two digits in place and rotate the other ones: 68579.

Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains only one digit which rotated is itself.

You have the following sequence of numbers: 56789 -> 67895 -> 68957 -> 68579 -> 68597

and you must return the greatest: 68957.


Task: Write function max_rot(n) which given a positive integer n returns the maximum number you got doing rotations similar to the above example.

So max_rot (or maxRot or ... depending on the language) is such as:

max_rot(56789) should return 68957

max_rot(38458215) should return 85821534
