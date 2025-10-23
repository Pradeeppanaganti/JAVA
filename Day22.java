/* import java.util.*;
public class Day22 {
    public static void evenorOdd(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

    }
    public static void main(String args[]){
        int n = 5;
        evenorOdd(n);
    }
} */

// Get ith bit
public class Day22 {
    public static int getIthBit(int n, int i) {
        int bitMask = 1;
        int ith = (n & (bitMask << i));
        if (ith == 0) {
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n , int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n,i);
        // }
        // else {
        //     return setIthBit(n,i);
        // }
        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = ~(0)<<i;
        return n & bitMask;
    }

    public static int clearBits(int n, int i , int j) {
        int a = ~(0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo (int n) {
        return (n & (n - 1)) == 0;
    }
    public static void main(String args[]){
        int n = 16;
        int i = 0;
        int j = 2;
        // int newBit = 1;
        System.out.println(isPowerOfTwo(n));
    }
}
