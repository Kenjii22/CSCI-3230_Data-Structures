**Exercise18_01:**

Using the BigInteger class introduced in Section 10.9, you can find the factorial for a large number (e.g., 100!). Implement the 
factorial method for BigInteger using recursion. Write a program that prompts the user to enter an integer and displays its factorial.

**Exercise18_03:**

The gcd(m, n) can also be defined recursively as follows:
- If m % n is 0, gcd(m, n) is n.
- Otherwise, gcd(m, n) is gcd(n, m % n).
Write a recursive method to find the GCD. Write a test program that prompts the user to enter two integers and displays their GCD.

**Exercise18_11:**

Write a recursive method that computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program that prompts the user to enter an integer and displays its sum.

**Exercise18_17:**

Write a recursive method that finds the number of occurrences of a specified character in an array. You need to define the following two methods. The second one is a recursive helper method.

public static int count(char[] chars, char ch)
public static int count(char[] chars, char ch, int high) 

Write a test program that prompts the user to enter a list of characters in one line, and a character, and displays the number of occurrences of the character in the list.

**Exercise18_21:**

Write a recursive method that converts a decimal number into a binary number as a string. The method header is:

public static String dec2Bin(int value) 

Write a test program that prompts the user to enter a decimal number and displays its binary equivalent.
