// Trapped Rain Water Problem

public class TrappedRainWater {
    public static void trappedWater(int number[]) {
        int n = number.length;
        
        // Case 1: if array length less than 3
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
        int leftMB[] = new int[n];
        int RightMB[] = new int[n];

        // Left Max Boundary 
        leftMB[0] = number[0];
        for (int i = 1; i < n; i++) {
            leftMB[i] = Math.max(number[i], leftMB[i - 1]);
        }

        // Right Max Boundary
        RightMB[n - 1] = number[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMB[i] = Math.max(number[i], RightMB[i + 1]);
        }

        // Trapped Water Calculation
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMB[i], RightMB[i]);
            trappedwater += waterLevel - number[i];
        }

        System.out.println("The Total Trapped water is: " + trappedwater);
    }

    public static void main(String args[]) {
        int number[] = {4, 2, 0, 6, 3, 2, 5};
        trappedWater(number);
        
        // Additional test cases
        System.out.println("\nTest case 2:");
        int[] test2 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        trappedWater(test2);
        
        System.out.println("\nTest case 3 (ascending):");
        int[] test3 = {1, 2, 3, 4, 5};
        trappedWater(test3);
        
        System.out.println("\nTest case 4 (less than 3 bars):");
        int[] test4 = {2, 3};
        trappedWater(test4);
    }
}