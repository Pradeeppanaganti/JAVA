//Code for inputting three numbers and finding their average
/* 
import java.util.*;

public class VariablesDataTypesQS {  // valid class name
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int avg = (a + b + c) / 3;
            System.out.println("The average of three numbers is " + avg);
        }
    } 
}
 */

 //Area of Square
 /* import java.util.*;

 public class VariablesDataTypesQS {
    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int side = sc.nextInt();
            int area = side * side ;
            System.out.println("The area of square is " + area);
        }
    }
 } */

//cost of 3 items from user
import java.util.*;
public class VariablesDataTypesQS {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            float item1 = sc.nextFloat();
            float item2 = sc.nextFloat();
            float item3 = sc.nextFloat();
            float totalcost = item1 + item2 + item3 + 0.18f * (item1 + item2 + item3);
            System.out.println("The total cost of three items is " + totalcost);
        }
    }
}