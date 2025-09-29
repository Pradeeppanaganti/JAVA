// Patterns
// *
// **
// ***
// ****
/* import java.util.*;
public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  rows = sc.nextInt();
        int coloumns = rows;
        for (int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
} */


//inverted Star Pattern

/* public class patterns {
    public static void main(String args[]) {
        int n = 7;
        for(int line = 1; line <= n; line++) {
            for(int star=1; star <=n-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

//Print Half Pyramid Pattern
// 1
// 12
// 123
// 1234
/* public class patterns {
    public static void main(String args[]) {
        int number = 4;

        for (int line = 1; line <= number ; line++) {
            for (int numbers = 1; numbers <= line; numbers++) {
                System.out.print(numbers);
            }System.out.println();
    }
}
 */

// Character Pattern

/* public class patterns {
    public static void main(String args[]) {
        int n = 5 ;
        char ch = 'A';
        
        //outer loop
        for(int line=1; line <= n; line++) {
            //inner loop
            for(int chars=1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        }
    } */

// Pattern
// *****
// *   *
// *   *
// *****

/* import java.util.*;
public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            if(line == 1 || line == n) {
                System.out.println("*****");
            }
            else {
                System.out.println("*   *");
            }
        }
    }
} 
*/
 
// Pattern 
//     *
//    **
//   ***
//  ****
/* 
import java.util.*;
public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++) {
            for(int space = 1; space <= n-line; space++) {
                System.out.print(" ");
            }
            for(int star = 1; star < line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

// Pattern
//12345
//1234
//123
//12
//1
/* 
import java.util.*;
public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++) {
            for(int number = 1; number <= n -line + 1; number++) {
                System.out.print(number);
            }
            System.out.println();
        }

    }
} */

// Pattern
// 1
// 23
// 456
// 78910
// 1112131415

/* 
import java.util.*;
public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int line = 1; line <= n; line++) {
            for(int count = 1; count <= line ; count++) {
                System.out.print(num+" ");
                num += 1;
            }
            System.out.println();
        }
    }
} */

// Pattern
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

import java.util.*;
public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            if(line % 2 == 0) {
                int number = 0;
                int counter = 1;
                while(counter <= line) {
                    System.out.print(number);
                    number = 1 - number;
                    counter++;
                }
            } else {
                int number = 1;
                int counter = 1;
                while(counter <= line) {
                    System.out.print(number);
                    number = 1 - number;
                    counter++;
                }
            } System.out.println();
        }
    }
}
