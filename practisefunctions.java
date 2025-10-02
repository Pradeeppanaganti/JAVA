//Java method to compute the average of three numbers.

/* public class practisefunctions {
    public static int average(int a, int b, int c) {
        int avg = (a + b + c)/3;
        System.out.println("The avg of three numbers is :" + avg);
        return avg;
    }
    public static void main(String args[]) {
        average(1,2,3);
    }
} */

//Methods are the sequence of operations enclosed under a name

// Even or Odd 

/* 
public class practisefunctions {
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(4)); // Example usage
    }
} */

// Palindrome number or not
/* 
import java.util.*;
public class practisefunctions {
    public static boolean ispalindrome(int n) {
        int original = n;
        int num2 = 0;

        while (n > 0) {
            int digit = n % 10;
            num2 = (num2 * 10) + digit ;
            n /= 10;
        }
        return num2 == original;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ispalindrome(n));
    }
} */


//Exploring Math functions in Java
/* public class practisefunctions {
    public static void Mathfunctions(int a, int b) {
        System.out.println("min: " + Math.min(a, b));
        System.out.println("max: " + Math.max(a, b));
        System.out.println("sqrt(a): " + Math.sqrt(a));
        System.out.println("abs(a): " + Math.abs(a));
        System.out.println("a^b: " + Math.pow(a, b));
    }
    public static void main(String args[]) {
        Mathfunctions(5, 10);
    }
} */

//Sum of digits of a number
/* import java.util.*;
public class practisefunctions {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
} */

//Sum of digits of a number
/* 
import java.util.*;
public class practisefunctions {
    public static int sumOfDigits(int n) {
        int givNum = n;
        int sumNum = 0;
        while(n > 0){
        int lastDig = n % 10;
        sumNum += lastDig;
        n = n / 10;
    }
    System.out.println("The sum of Digits of "+ givNum +" is :"+ sumNum);
    return sumNum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfDigits(n);
    }
} */

//Palindrome or not

import java.util.*;
public class practisefunctions {
    public static boolean ispalindrome(int n) {

        int givNum = n;
        int afterNum = 0;

        while(n > 0) {
            int lastNum = n % 10;
            afterNum = (afterNum * 10) + lastNum;
            n /= 10;
        }
        return givNum == afterNum;
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ispalindrome(n));
        sc.close();
    }
}