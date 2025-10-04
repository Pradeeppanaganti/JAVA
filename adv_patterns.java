// Hollow Rectangle

/* 
import java.util.Scanner;

public class adv_patterns {
    public static void hollow_rectangle(int totRows, int totCols) {

        //outer loop
        for(int i = 1; i <= totRows; i ++) {
            //inner-coloumns
            for(int j = 1; j <= totCols; j++) {
                //cell -> (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int totRows = sc.nextInt();
        int totCols = sc.nextInt();
        hollow_rectangle(totRows, totCols);
    }
} 
*/

// Inverted Half Pyramid
/*
import java.util.*;
public class adv_patterns {
    public static void half_pyramid(int n) {
        for(int i = 0; i < n; i++ ) {
            for(int j=0;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        half_pyramid(n);
    }
}
*/

//Advanced Patterns
/* 
import java.util.*;
public class adv_patterns {
    public static void pattern(int n) {
        for(int i = 1; i <= n; i++) {
            int k = 1;
            //numbers
            for(int j = 1; j <= n-i+1 ; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
 */

//Advanced Patterns
/* 
import java.util.*;
public class adv_patterns {
    public static void pattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
} */