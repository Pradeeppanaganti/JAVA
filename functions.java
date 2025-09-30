//Functions in Java
/* 
import java.util.*;
public class functions{
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

    public static int calculateSum(int num1 , int num2) { // Parameters or Formal Parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = calculateSum(a , b); // Arguments or Actual Parameters
       System.out.println("Sum is: " + sum);
    }
} */


/* 
public class functions {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        int product = multiply(a , b);
        System.out.println("Product is a * b " + product);
        product = multiply(10 , 20);
        System.out.println("Product is a * b " + product);
    }
} */

// Factorial of a number using functions

/* import java.util.*;
public class functions {
    // Functions in Java
    /*
    import java.util.*;
    public class functions {
        public static void printHelloWorld() {
            System.out.println("Hello World!");
            System.out.println("Hello World!");
            System.out.println("Hello World!");
        }

        public static int calculateSum(int num1 , int num2) { // Parameters or Formal Parameters
            int sum = num1 + num2;
            return sum;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = calculateSum(a , b); // Arguments or Actual Parameters
            System.out.println("Sum is: " + sum);
        }
    }
    */

    /*
    public class functions {
        public static int multiply(int a, int b) {
            int product = a * b;
            return product;
        }

        public static void main(String args[]) {
            int a = 3;
            int b = 5;
            int product = multiply(a , b);
            System.out.println("Product is a * b " + product);
            product = multiply(10 , 20);
            System.out.println("Product is a * b " + product);
        }
    }
    */

    // Factorial of a number using functions
    /*
    import java.util.*;
    public class functions {
        public static int factorial(int n) {
            int fact = 1;
            for( int i = 1;i <= n ; i++) {
                fact *= i;
            }
            return fact;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int result = factorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }
    }
    */

    // Find Binomial Coefficient using functions
   /*  import java.util.*;
    public class functions {
        public static int factorial(int n) {
            int fact = 1;
            for( int i = 1;i <= n ; i++) {
                fact *= i;
            }
            return fact;
        }

        public static int binCoefficient(int n , int r) {
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_n_r = factorial(n - r);
            int binCoeff = fact_n / (fact_r * fact_n_r);
            return binCoeff;
        }
        public static void main(String[] args) {
            System.out.println(functions.binCoefficient(5, 2));
        }
    }     */     


// Funtion Overloading/ Method Overloading in Java

// It is using multiple methods with same name but different parameters 
// can be done using either changing parameters or by changing data types of parameters

// Using different Parameters
/* 
public class functions {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a , int b,int c) {
        return a + b + c;
    } 
    public static int add(int a ,int b, int c, int d) {
        return a + b + c + d;

    }
    public static void main(String args[]) {
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
        System.out.println(add(5, 10, 15, 20));
    }
}
 */

// Using different Data Types
/* 
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a,double b) {
    return (a + b);
}

public static void main(String args[]) {
    System.out.println(add(5,10));
    System.out.println(add(5.21f,10.5f));
} */

//Checking Prime of a number using traditional method

/* 
import java.util.*;
public class functions {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Take input from user
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
} */

// Checking Prime of a number using optimized method
/* 
import java.util.*;
public class functions {
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n% i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
} */

// Checking prime for sppecified range
/* import java.util.*;
public class functions {
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n% i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    for(int j = 1; j <= range; j++) {
        if(isPrime(j)) {
            System.out.print(j + " ");
        }
    }
}
} */


//Practise

import java.util.*;
public class functions {

    //is prime function
    public static boolean isPrime(int n) {
        if (n <= 1 ) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Primes in range
    public static void primesInRange(int range) {
        for (int j = 1; j <= range; j++) {
            if(isPrime(j)) {
                System.out.print(j + " ");
            }
        }
    }

    //Bin to Dec
    public static void binTODec(int n) {
        int givNum = n;
        int pow = 0;
        int decNum = 0;

        while(n > 0) {
            int num = n % 10;
            decNum = decNum + (int)(num * Math.pow(2, pow));

            pow++;
            n = n / 10;
        }
        System.out.println("The Dec101 number of " + givNum + "is equal to "+ decNum);
    }

    //Dec to Bin
    public static void decToBin(int n) {
        int givNum = n;
        int pow = 0;
        int binNum = 0;
        
        while (n > 0) {
            int num = n % 2;
            binNum = binNum + (int)(num * Math.pow(10, pow));

            pow++;
            n = n / 2;
        }
        System.out.print("The Bin num of the "+ givNum + " is equal to " + binNum);
    }




    // Main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number Change:");
        int num = sc.nextInt();
        decToBin(num);
    }
} 