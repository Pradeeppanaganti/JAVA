
// import java.util.Arrays;

/* import java.util.Scanner;

public class Matrix {

    public static boolean search(int matrix [][], int key) {
        for(int i = 0;i < matrix.length; i++) {
            for( int j = 0; j < matrix[0].length; j++) {
                if( matrix[i][j] == key) {
                    System.out.println("The Key is found at" + "(" + i +","+ j +")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void minMax(int matrix [][]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxRow = 0, maxCol = 0, minRow = 0, minCol = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for( int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minRow = i;
                    minCol = j;
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("The max value of matrix is:" + max + " is at location (" + maxRow + "," + maxCol + ")");
        System.out.println("The min value of matrix is:" + min + " is at location (" + minRow + "," + minCol + ")");
    }

    public static void main(String[] args) {
        // Defining a 2D array
        int matrix [] [] = new int[3] [3];
        int n = matrix.length; int m = matrix[0].length;
         
        // Input to matrix
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i] [j] = sc.nextInt();
            }
        }
        // Printing elements of matrix
        for(int i = 0;i < n; i++) {
            for(int j = 0;j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //calling search function
        // search(matrix, 5);

        //Calling maxMin functions
        minMax(matrix);
    }

} */

//Spiral Matrix
/* 
public class Matrix {

    public static void printSpiral(int matrix [][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while()
    }

    public static void main(String args[]) {
        int matrix [][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        printSpiral(matrix);
    }
} */


// Practisee

//Printing the number of 7's in the 2 d array
/* 
public class Matrix {
    public static void numofelements(int matrix [][],int key) {
        int count = 0;
        for(int i = 0; i < matrix.length;i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println("The number of 7's in th array are " + count);
    }
    public static void main(String args[]) {
        int matrix [][] = {{7,7,7},{7,7,7}};
        int key = 7;
        numofelements(matrix,key);
    }
} */

// Print out the sum of the numbers inthe second row of the “nums” array.
/* 
public class Matrix {

    public static void secondRow(int nums [] []) {
        for(int i = 0; i < nums.length;i++) {
            for(int j = 0; j < nums[0].length; j++) {
                if(i == 1) {
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
    }

    public static void main(String args[]) {
        int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
        secondRow(nums);
    }
} */

// Write a program to FindTransposeofa Matrix.
/* 
public class Matrix {
    
    public static int[][] transpose(int matrix [][]) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,9},{11,4,3},{2,2,3}};
        transpose(matrix);
    }
} */