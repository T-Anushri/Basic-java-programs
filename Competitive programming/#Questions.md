**Bank.java**

Perform using JAVA. There are two banks; Bank A and Bank B. Their interest rates vary. You have received offers from both banks in terms of the annual rate of interest, tenure, and variations of the rate of 
interest over the entire tenure. You have to choose the offer which costs you least interest and reject the other. Do the computation and make a wise choice. Save the input credentials and output in a file ‘bank.txt’.  
The loan repayment happens at a monthly frequency and Equated Monthly Installment (EMI) is calculated using the formula given below :  
***EMI = loanAmount * monthlyInterestRate / ( 1 – 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))*** 

*Constraints:*  
+ 1 <= P <= 1000000
+ 1 <=T <= 50
+ 1<= N1 <= 30
+ 1<= N2 <= 30
  
*Input Format:*  
+ First line : P – principal (Loan Amount)
+ Second line : T – Total Tenure (in years).
+ Third Line: N1 is the number of slabs of interest rates for a given period by Bank A. First slab starts from the first year and the second slab starts from the end of the first slab and so on.
+ Next N1 line will contain the interest rate and their period.
+ After N1 lines we will receive N2 viz. the number of slabs offered by the second bank.
+ Next N2 lines are the number of slabs of interest rates for a given period by Bank B. The first slab starts from the first year and the second slab starts from the end of the first slab and so on.
+ The period and rate will be delimited by single white space.
  
*Output Format:*  
Your decision – either Bank A or Bank B.  

**Count.java**

 Java Program to Count the Occurrences of Each Character in String.

**Flight.java**

Write a JAVA program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

**Music.java**

Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.

**MyCalculatorApp.java**

Write a JAVA program to Compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int).   
This method takes two integers, n and p, as parameters and finds np.   
If either n or p is negative, then the method must throw an exception which says “n or p should not be negative”. Also, if both n and p are zero, then the method must throw an exception which says “n and p should not be zero”

**Remove.java**

Given an array arr[] of n integrs which are to be put in an ArrayList and an integer k. Iterate the Array List using iterator and remove all the numbers of the ArrayList which are less than k. And then return the sorted ArrayList.  

*Example 1:*  

*Input:* n = 5, k = 8, arr[] = {1, 6, 9, 2, 11}  
*Output:* [9,11]    
*Explanation:* The numbers 1, 6 and 2 are less than 8, and so they are removed.

*Example 2:*

*Input:* n = 4, k = 13, arr[] = {1, 4, 6, 9}  
*Output:* []  
*Explanation:* All the numbers are less than 13, and so they are removed.

*Your Task:*   
You don't need to read input or print anything. Your task is to complete the function javaIterator() which takes 2 Integers n, k, and an array arr[] of n integers as input and returns a sorted ArrayList after removing all elements less than k.  
*Expected Time Complexity:* O(n)

**Solution.java**

Write a JAVA program, where it has defined a class Solution with a main method.   
Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.  
If B <= 0 or H <= 0, the output should be “java.lang.Exception: Breadth and height must be positive” without quotes.

**Sorting.java**

Write a JAVA program to sort the array alternately i.e first element should be max value, second min value, third second max, third second min.   
*Example:*   
Input: arr[] = {1,2,3,4,5,6,7}   
Output: {7,1,6,2,5,3,4}

**Specalize.java**

Perform using JAVA.You are given a main() function which takes a set of inputs. The type of input governs the kind of operation to be performed, i.e. concatenation for strings and addition for int or float.  
You need to write the class template AddElements which has a function add() for giving the sum of int or float elements. You also need to write a template specialization for the type string with a function concatenate() to concatenate the second string to the first string.  
*Sample Input:*  
3  
string John Doe   
int 1 2   
float 4.0 1.5  
*Sample Output:*  
JohnDoe  
3   
5.5  

**Split.java**

Write a JAVA program that accepts comma-separated strings, sorts the strings in ascending order, and outputs the concatenated string of sorted strings.

**StackDemo.java**

Write a JAVA program implementing Stack ADT using class template & perform the required operations like PUSH and POP. Pass int, float and char data types to the Stack class.

**UserName.java**

Perform the following in JAVA. You are updating the username policy on your company’s internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:  
The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.  
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a – z], uppercase characters [A – Z], and digits 
[0 – 9].  
The first character of the username must be an alphabetic character, i.e., either a lowercase character [a – z] or uppercase character [A – Z].  
*For example:*  
+ Julia = INVALID; Username length < 8 characters
+ Samantha = VALID
+ Samantha_21 = VALID
+ 1 = INVALID; Username begins with non-alphabetic character
+ ? = INVALID; ‘?’ character not allowed  

Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.

**VowelsConsonants.java**

Write a Java Program to Count Vowels and Consonants in a String.
