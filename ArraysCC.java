/* import java.util.*;
public class ArraysCC {
    public static void main(String args[]) {

        //Def using size
        int marks [] = new int[50];

        //Def using values
        int numbers [] = {1,2,3,4,5};

        //String array
        String fruits [] = {"Apple","mango","banana"};

    }
} */

/* import java.util.*;
public class ArraysCC {
    public static void main(String args[]) { 

        int marks [] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Length of array: " + marks.length);

        marks[0] = sc.nextInt(); //Phy
        marks[1] = sc.nextInt(); //Chem
        marks[2] = sc.nextInt(); //Math

        System.out.println("Phy marks: " + marks[0]);
        System.out.println("Chem marks: " + marks[1]);
        System.out.println("Math marks: " + marks[2]);


        marks[2] = marks[2] + 1; //Math marks updated;
        System.out.println("Updated Math marks: " + marks[2]);

        //Percentage of marks
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage: " + percentage + "%");


    }
} */

/* 
import java.util.*;
public class ArraysCC {
    public static void update (int marks[]) {
        for(int i = 0; i < marks.length; i++) {
            marks[i]= marks[i] + 1; //Incrementing each element by 1
        }
    }
    public static void main(String args[]) { 

        int marks [] = {97,98,99};
        update(marks); //Passing array to function

        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
} */


//

// Linear Search

/* 
import java.util.*;
public class ArraysCC {
    public static int LinearSearch(int numbers [], int key) {

        for(int i = 0; i < numbers.length; i++) {
        if (numbers[i] == key) {
            return i;
        }
    }
    return -1;
    }
    public static void main(String args[]) {
        int numbers [] = {12,21,10,19,14,27};
        int key = 14;

        int index = LinearSearch(numbers,key);

        if (index == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Key is found at " + index);
        }
    }
}
 */
// Largest in a Array
/* 
import java.util.*;
public class ArraysCC {
    public static int largest(int numbers []) {
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for( int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number in array is " + smallest);
        return greatest;
    }

    public static void main(String args[]) {
        int numbers [] = {1,4,2,5,9,8,6,7};
        int greatest = largest(numbers);
        System.out.println("The Largest number in array is " + greatest);

    }
} */

//Binary Search 
/* 
import java.util.*;
public class ArraysCC {

    public static int binarySearch(int[] numbers, int key) {
        int start = 0 , end = numbers.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if (numbers[mid] == key) {  // found
                return mid;
            }

            if (numbers[mid] > key) { // left 
                end = mid - 1;
            }
            else { 
                start = mid + 1; // right
            }
        }
        return -1; // not found
        }
    
    public static void main(String args[]) {
        int numbers [] = {2,4,6,8,10,12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to find :");
        int key = sc.nextInt();
        int index = binarySearch(numbers,key);
        System.out.println("The element is at Index : " + index);
    }
} */

// Reverse an Array
/* 
import java.util.*;

public class ArraysCC {
    public static void reverseArray(int numbers []) {

        //Reverse of a array 
        int start = 0;
        int end = numbers.length - 1;

         while (start < end ) {
            // Swap 
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
         }
    }

    public static void main(String args []) {
        int numbers [] = {2,4,6,8,10};
        
        reverseArray(numbers);
        System.out.print("The reverse of numbers is : ");
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(" "+numbers[i] + " ");
        }
        System.out.println();
    }
} */

// Printing pairs in an array

/* // import java.util.*;
public class ArraysCC {
    public static void printPairs(int numbers []) {
        int totalPairs = 0;
        System.out.print("Pairs : ");
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                totalPairs++;
            }
        }
        System.out.println();
        System.out.println("The Total pairs are :" + totalPairs);
    }
    public static void main(String args []) {
        int numbers [] = {2,4,6,8,10};
        printPairs(numbers);
    }
} */

// Sub Arrays
/* 
import java.util.*;
public class ArraysCC {
    public static void printSubArrays(int numbers []) {
        int totalSubArrays = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        // Initializing Start
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            //Initializing End
            for ( int j = i; j < numbers.length; j++) {
                int end = j;
                int SumofSubArrays = 0;

                //Printing the Sub-Arrays
                for (int k =start;k <= end; k++) {
                System.out.print(numbers[k] + " ");
                totalSubArrays++;
                SumofSubArrays += numbers[k];
            }
            System.out.println();
            System.out.println("The sum of sub arrays :" + SumofSubArrays);
            if (SumofSubArrays < minSum) {
                minSum = SumofSubArrays;
            }
            if (SumofSubArrays > maxSum) {
                maxSum = SumofSubArrays;
            }
        }
        System.out.println();
    }
    System.out.println("The Total Sub Arrays are :" + totalSubArrays);
    System.out.println("The min Sum of SubArray is :" + minSum);
    System.out.println("The max Sum of SubArray is :" + maxSum);

}

    public static void main(String args[]) {
        int numbers [] = {2,4,6,8,10};
        printSubArrays(numbers);
    
}
} */

//Arrays Part - 2

// MAx Sub Array [Brute Force]

/* 
import java.util.*;

public class ArraysCC {
    public static void maxSum(int numbers []) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        //Start 
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            //end
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                //The Sub Arrays
                for (int k = start; k <= end; k++) {
                currSum += numbers[k];
                    if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }System.out.println(currSum);
        }
    }
    System.out.println("The Maximum Sum of all SubArrays is : " + maxSum);
}

    public static void main(String args[]){
        int numbers [] = {1,-2,6,-1,3};
        maxSum(numbers);
    }
} */

// MAx SubArray [Prefix Sum]
/*  
public class ArraysCC {
    public static void maxSum(int numbers []) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix [] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate Prefix Array 
            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i - 1] + numbers[i];
            }

        //Start 
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            //end
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                //The Sub Arrays
                // for (int k = start; k <= end; k++) {
                // currSum += numbers[k];
            }
            // System.out.println(currSum);
            if (currSum > maxSum) {
                    maxSum = currSum;
                }
        }
    System.out.println("The Maximum Sum of all SubArrays is : " + maxSum);
}


    public static void Kadanes (int numbers [] ) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;

        for( int i = 0; i < numbers.length ; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            } 
            maxSum = Math.max(cs, maxSum); 
        }

        System.out.println("Our Max sub array of sum is :" + maxSum);
    }

    public static void main(String args[]){
        int numbers [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(numbers);
    }
} 
 */

// Trapped Rain Water
/* 
public class ArraysCC {
    public static void trappedWater (int number []) {
        int n = number.length;
        
        // Case 1 if array length less than 3
        if (n < 3) {
            System.out.println("No Water trapped");
            return;
        }
        
        // Check if array is strictly ascending or descending
        boolean ascending = true;
        boolean descending = true;
        
        for (int i = 0; i < n - 1; i++) {
            if (number[i] >= number[i + 1]) {
                ascending = false;
            }
            if (number[i] <= number[i + 1]) {
                descending = false;
            }
        }
        
        if (ascending || descending) {
            System.out.println("No Water Trapped");
            return;
        }
        
        // If we reach here, water can be trapped
        System.out.println("Water can be trapped!");

        // Initializing LeftMB and Right MB
        int leftMB [] = new int[n];
        int RightMB [] = new int[n];

        // Left Max Boundary 
        leftMB[0] = number[0];
        for( int i = 1; i < n; i++) {
            leftMB[i] = Math.max(number[i], leftMB[i-1]);
        }

        // Right Max Boundary
        RightMB[n - 1] = number[n - 1];
        for( int i = n - 2; i >= 0; i--) {
            RightMB[i] = Math.max(number[i], RightMB[i+1]);
        }

        //Trapped Water Calculation
        int trappedwater = 0;
        for (int i = 0; i < n - 1; i++) {
            int waterLevel = Math.min(leftMB[i], RightMB[i]);
            trappedwater += waterLevel - number[i];
        }

        System.out.println("The Total Trapped water is :" + trappedwater);
    }

    public static void main(String args[]) {
        int number [] = {4,2,0,6,3,2,5};
        trappedWater(number);
    }
} */

// Best Time to buy and Sell Stocks

public class ArraysCC {

    public static int buyAndSellstocks (int prices []) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i] ) { //profit
                int Profit = prices[i] - buyPrice ; //todays profit
                maxProfit = Math.max(maxProfit , Profit); // global profit
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices [] = {7, 1 , 5 , 3, 6, 4}; // O(n)
        System.out.println(buyAndSellstocks(prices));

    }
}