// BitWise Operators

/* import java.util.*;
public class Day21 {
    public static void bitwiseOperator(int m , int n) {
        System.out.println(m & n);
        System.out.println(m | n);
        System.out.println(m ^ n);
        System.out.println(~m);
        System.out.println(m << n);
        System.out.println(m >> n);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        bitwiseOperator(int m,int n);
    }
} */

// Odd or Even
/* import java.util.*;
public class Day21 {
    public static boolean oddorEven(int n) {
        return (n & 1) == 0;
    }
    public static void main(String args[]) {
        System.out.println("Enter the number to check odd or even:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(oddorEven(n));
    }
} */

// Get ith Bit
public class Day21 {
    public static int getith( int n, int i) {
        int bitmask = 1<<i;
        if((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String args[]) {
        int n = 10; // example value
        int i = 3; // example value
        System.out.println(getith(n,i));
    }
}