/* // Bubble Sort basic

import java.util.*;
public class sorting {

    public static void bubblesort(int nums []) {
        // outer loop 
        for (int turn = 0; turn < nums.length - 1; turn ++) {
            int count = 0; // Reset count for each pass
            for(int j = 0; j < nums.length - 1 - turn; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    count++;
                }
            } 
            while (count > 0) {
                System.out.println("The Array is already sorted");
                break;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
    }
    }

    public static void selectionsort(int nums[]) { 
        for (int turns = 0; turns < nums.length - 1;turns ++) {
            int minPos = turns;
            for (int j = turns + 1; j < nums.length ; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = nums[minPos];
            nums[minPos] = nums[turns];
            nums[turns] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void insertionsort (int nums []) {
        for ( int i = 1 ;i < nums.length ;i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            //Insertion 
            nums[prev + 1] = curr;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] nums = {5, 1, 4, 2, 3}; // Scrambled array
        System.out.println("\nSorted array:");
        insertionsort(nums);
    }
} */

// Inbuilt sorting

/* import java.util.Arrays;
import java.util.Collections;
public static void main(String args[]) {
     Integer nums [] = {1,2,4,3,5};
    Arrays.sort(nums, Collections.reverseOrder());
    System.out.println(Arrays.toString(nums));
} */

/* // Counting Sort

import java.util.*;

public class sorting {
    public static void countingsort(int arr []) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count [] = new int[largest + 1];
        for(int i = 0;i < arr.length; i++) {
            count[arr[i]]++;
        }

        //Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void main(String[] args) {
        // Main method for testing
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
 */

// Practise Sorting Techniques in descending order

import java.util.Arrays;
import java.util.Collections;
public class sorting {

    // Bubble Sort
    public static void bubblesort(int nums []) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] < nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length;i++) {
            System.out.print(nums[i] + " ");
            }
    }


    // Selection Sort 
    public static void selectionsort(int nums[]) {
        for(int i = 0; i < nums.length ; i++) {
            int maxPos = i;
            for (int j = i + 1; j < nums.length; j++ ) {
                if (nums[maxPos] < nums[j]) {
                    maxPos = j;
                }

            }
            int temp = nums[maxPos];
            nums[maxPos] = nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i < nums.length;i++) {
            System.out.print(nums[i] + " ");
            }
    }


    // Insertion Sort (descending order)
    public static void insertionsort(int nums []) {
        // start from 1 since the single-element prefix at index 0 is already "sorted"
        for(int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            // for descending order, shift while previous element is smaller than curr
            while(prev >= 0 && nums[prev] < curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            // Insert current element into its correct position
            nums[prev + 1] = curr;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Counting sort
    public static void countingsort(int nums []) {

        // Extracting Largest number in array
        int largest = Integer.MIN_VALUE;
        for(int i= 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count [] = new int[largest + 1];
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Sort in descending order by iterating from largest to 0
        int j = 0;
        for(int i = count.length - 1; i >= 0; i--) {
            while(count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;  // Decrement the count
            }
        }
        // Print the sorted array
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        Integer nums [] = {2, 1, 4, 3, 5};  // Changed to Integer[]
        Arrays.sort(nums,0,5,Collections.reverseOrder());
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
