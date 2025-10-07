<<<<<<< HEAD
/* import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String type = (n % 2 == 0) ? "true" : "false";
        System.out.println(type);
        sc.close();
    }
} */

/* //Switch Case
import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = 'c';
        switch(ch) {
            case 'b': System.out.println("Burger");
            break;
            case 'a': System.out.println("Pizza");
            break;
            case 'c': System.out.println("Pasta");
            break;
            default: System.out.println("Invalid");
        }
        sc.close();
    }
} */

//Calculator using switch case

/* import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter operator :");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a + b);
            break;
            case '-' : System.out.println(a - b);
            break;
            case '*' : System.out.println(a * b);
            break;
            case '/' : System.out.println(a / b);
            break;
            case '%' : System.out.println(a % b);
            break;
            default : System.out.println("Invalid");
        }
    }
} */

// Loops in Java

//While Loop Example 1

/* import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while(n < 10) {
            System.out.println(n);
            n++;
        }
    }
}
 */

// While Loop Example 2

/* import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int counter = sc.nextInt();
        while(counter <= 10) {
            System.out.println("Hello World!");
            counter++;
        }
        sc.close();
    }
} */

// While Loop Example 3
/* 
import java.util.*;
public class javabasics {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    int count = 1;

    while(count <= range) {
        System.out.print(count + " ");
        count++;
    }
}
} */

//Sum of n natural numbers using while loop

/* 
import java.util.*;
public class javabasics {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    int sum = 0;

    while (i <= n) {
        sum += i;
        i++;
    }
    
    System.out.println(sum);
    sc.close();
}
} */

// For Loops in Java
/* 
import java.util.*;

public class javabasics {
    public static void main(String args[]) {
        //int i = 1;
        for(int i =1; i <= 10; i++) {
            System.out.println("HELLO WORLD");
        }
    }
} */

// Pattern Printing
/* 
import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        // for(int i = 1; i <= 4; i++) {
        //     System.out.println("****");
        // }
        int line = 1;
        while(line <= 4) {
            System.out.println("****");
            line++;
        }
    }
} */

// Print Reverse of a number
/* 
import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        int n = 1234;

        while(n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10; // n /= 10
        }System.out.println();
    }
} */

// Reverse of a number 
/* import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        int n = 1234;
        int reverse = 0;
        while(n > 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10; // n /= 10
        }
        System.out.println(reverse);
    }
} */

// Do while 
/* import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        int counter = 1;
        do {
            System.out.println("Hello World!");
            counter++;
        } while(counter <= 10);
    }
} */

// Problem 
/* import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Your number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
            break;
            }
            System.out.println(n);
           } while(true);
    }
} */

/* import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        do { 
            System.out.print("Enter your number:");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
                }
            System.out.println("I Love you Shradha Mam");
        } while(true);
    }
} */

// Check if a number is prime or not
import java.util.*;
public class javabasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        }
        else{
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("n is Prime");
        } else {
            System.out.println("n is not Prime");
        }
    }
}
=======
public class javabasics {
    public static void main(String args[]) {
        /* byte a = 5;
        System.out.println(a);
        char ch = 'A';
        System.out.println(ch);
        boolean b = true;
        System.out.println(b);
        float f = 5.5f;
        System.out.println(f);
        int number = 25;
        //long
        //double
        short n = 56;
        System.out.println(n);
         */ // code to calculate sum of two numbers
        /* This
        is
        a multi line
        comment
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("The sum is " + sum);
         */
        //Scanner sc = new Scanner(System.in);
        //String input = sc.next();
        //System.out.println(input);
        //String name = sc.nextLine();
        //System.out.println(name);
        //int number = sc.nextInt();
        //System.out.println(number);
        //float marks = sc.nextFloat();
        //System.out.println(marks);
        //boolean value = sc.nextboolean();
        //double value1 = sc.nextDouble();
        /*long value2 =  sc.nextLong();
        System.out.println(value2);
        sc.close();
         */
        /* // Sum of a & b
                Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("THE sum is " + sum);
        } */
       // Product of a & b
        /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("The product is " + product); */
        // Area of circle
        /* Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("The area of circle is " + area);
        sc.close(); */
        /* int a = 25;
        long b = a;
        System.out.println(b); */
        // float a = 25.24718274901327491328f;
        /* int b = (int) a; // error
        System.out.println(b); */
        /* char ch = 'a' ;
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2); */
        /* int a = 10;
        float b = 20.25f;
        long c = 30;
        double d = 212;
         ans = a + b + c + d;
        System.out.println(ans); */
        /* byte a = 5;
        byte b = (byte) (a * 2);
        System.out.println(b); */
        //Operators
        /* int A = 10;
        int B = 5;
        System.out.println("multiply = " + (A * B)); */
        
        //Relational Operators
        int A = 10;
        int B = 5;
        System.out.println((A != B));

    } 
>>>>>>> origin/main
}