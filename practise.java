// Practise Question 1 
/*  
import java.util.*;
public class practise {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int number = sc.nextInt();
            String result = (number < 0) ? "The number is negative" : "The number is positive";
            System.out.println(result);
            }
        }
    }
}

// Practise Question 2
@SuppressWarnings("unused")
class Solution {
    public static void main(String[] args) {
        double temp = 103.5;
        String result = (temp > 100) ? "U have Fever" : "U don't have Fever";
        System.out.println(result);
    }
}
 */


// Practise Question 3

/* 
import java.util.*;
@SuppressWarnings("unused")
class practise {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            switch(number) {
                case 1 : System.out.println("Sunday");
                break;
                case 2 : System.out.println("Monday");
                break;
                case 3 : System.out.println("Tuesday");
                break;
                case 4 : System.out.println("Wednesday");
                break;
                case 5 : System.out.println("Thursday");
                break;
                case 6 : System.out.println("Friday");
                break;
                case 7 : System.out.println("Saturday");
                break;
                default : System.out.println("Invalid");
                break;
            }
        }
    }
} */

// Practise Question 4

/* public class Solution {
    public static void main(String args[]) {
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        // Optionally print the results
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
} */

// Output will be X = FALSE AND Y = 63 

// Practise Question 5
/* 
import java.util.*;
public class practise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a Leap year");
        }
    }
} */

