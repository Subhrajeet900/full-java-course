//2D array...........!

// import java.util.*;
// public class L10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows : ");
//         int rows = sc.nextInt();
//         System.out.print("enter the number of columns : ");
//         int cols = sc.nextInt();
//         int[][] matrix = new int[rows][cols];
//         //input
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         //output
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.println(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// Q -> Take a matrix as input from the user . search for agiven number x
//      and print the indices at which it occur .
import java.util.*;

public class L10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("enter the number of coloumns : ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // x to find the index from the matrix
        System.out.print("enter the number to find : ");
        int x = sc.nextInt();
        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("x found at loction (" + i + " , " + j + ")");
                }
            }
            System.out.println();
        }

    }
}
