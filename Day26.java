// Question:
// Create a class named Complex to represent complex numbers.
// Write separate methods to add, subtract, and multiply two complex numbers.
// The real and imaginary parts of both numbers should be entered by the user.
// Display the sum, difference, and product of the two complex numbers.

/* 
import java.util.*;
class Complex{
    int real, imag;

    //Constructor for real and imaginary
    Complex(int real , int imag){
        this.real = real;
        this.imag = imag;
    }

    //Add Constructor
    Complex add(Complex other){
        return new Complex(real + other.real, imag + other.imag);
    }

    //Subtract Constructor
    Complex Subtract(Complex other){
        return new Complex(real - other.real, imag - other.imag);
    }

    //Multiplication Constructor
    Complex Multiply(Complex other){
        int realPart = (real * other.real) - (imag * other.imag);
        int imagPart = (real * other.imag) + (imag * other.real);
        return new Complex(realPart, imagPart);
    }

    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + Math.abs(imag) + "i");
    }
}
public class Day26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part of First Number : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the imaginary part of First Number : ");
        int i1 = sc.nextInt();
        System.out.println("Enter the real part of Second Number : ");
        int r2 = sc.nextInt();
        System.out.println("Enter the imaginary part of Second Number : ");
        int i2 = sc.nextInt();
        sc.close();

        // Creating two complex numbers using constructor
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

         Complex sum = c1.add(c2);
        Complex diff = c1.Subtract(c2);
        Complex prod = c1.Multiply(c2);

        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();
        System.out.print("Product: ");
        prod.display();
    }
}
 */

 // Recursion Basics

 public class Day26{
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
         if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sumOfN(int n){
        if(n == 1){
            return 1;
        }
        int sumn = n + sumOfN(n - 1);
        return sumn;
    }

    public static int fibonacci(int n){
        if( n == 0 || n == 1){
            return n;
        }
        int fibN = fibonacci(n - 1) + fibonacci(n - 2);
        return fibN;
    }

    public static boolean isSorted(int arr [], int i){
        if(i == arr.length - 1){
            return true;
        }
        if( arr[i] > arr[i + 1]){
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOcc(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }

    public static int LastOcc(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = LastOcc(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int xPow(int x,int n){
        if(n == 0){
            return 1;
        }
        // int xn = x * xPow(x, n - 1);
        // return xn;
        return x * xPow(x, n/2);
    }

    public static int optimizedPow(int x,int n){ // O(log n)
        //Base Case
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPow(x, n/2);
        int halfPowerSq =  halfPower * halfPower;
        //if pow is odd
        if(n % 2 != 0){
            halfPowerSq *= x;
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
        // int arr []= {5,5,5,5};
        System.out.println(optimizedPow(2, 2));
    }
 }

