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
import java.util.*;
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
}