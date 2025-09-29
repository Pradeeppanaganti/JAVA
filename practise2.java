// The First Answer is 2 times


// The Program that reads a set of integers, and then prints the sum of the even and odd integers
/* import java.util.*;
public class practise2 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int choice = 0;
    int evensum = 0;
    int oddsum = 0;

    do { 
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if( number % 2 == 0){
            evensum += number;
        } else {
            oddsum += number;
        }

          System.out.println("Do you want to continue? if yes the type 1 , Else 0 ");
        choice = sc.nextInt();

    } while (choice == 1);

    System.out.println("The Evensum is :" + evensum);
    System.out.println("The Oddsum is :" + oddsum);
    }
} */




//Factorial of a number
/* import java.util.*;
public class practise2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;


        if (n < 0) {
            System.out.println("The factorial doesn't exist");
        } else {
            for(int i = 1 ; i <= n; i++) {
                fact *= i;
            }
        }
            System.out.println(fact);
}
} */



//Progaram that gives multiplication table of a Number N,entered by the user.
/* import java.util.*;
public class practise2 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println("The multiplication table for " + n + " is :");
    int val = 0;

    for(int i = 1; i < 11 ; i++) {
        val = n * i;
        System.out.println(n+" "+"*"+" "+i+" "+"="+" "+ val);
    }
    }
} */



