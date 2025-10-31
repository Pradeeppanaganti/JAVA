/* public class Day23 {
    public static int clearRangeBits(int bit,int i,int j) {
        int a = ~(0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return bit & bitMask;
    }
    public static void main(String args[]) {
        System.out.println(clearRangeBits(10,2,4));
    }
} */


// Fast Exponential power
/* public class Day23 {
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0) {
                ans = ans * a;
            }
            a *= a;
            n >>= 1;
        }
        return ans;
    }
    public static void main(String args[]) {
        System.out.println(fastExpo(5,3));
    }
} */


//Practise

// Swapping two numbers with out third variable
/* import java.util.*;
public class Day23 {
    public static void binSwap(int n, int m){
        System.out.println("Before swapping: n = " + n + ", m = " + m);
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        System.out.println("After swapping: n = " + n + ", m = " + m);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the two numbers:");
            int n = sc.nextInt();
            int m = sc.nextInt();
            binSwap(n, m);
        }
    }
} */

//Adding 1 to the number
/* public class Day23{
    public static void add1(int n){
        n = -~n;
        System.out.println(n);
    }
    public static void main(String args[]) {
        add1(12);
    }
} */

public class Day23 {
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' ') + " ");
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}

