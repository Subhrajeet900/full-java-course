//pattern printing
// Q1 .rectangle pattern
// import java.util.*;

// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows: ");
//         int n = sc.nextInt();
//         System.out.print("enter the number of coloumns: ");
//         int c = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= c; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();    // for print again and again in rows........
//         }
//     }
// }
// Q2.hollow rectangle pattern
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows: ");
//         int r = sc.nextInt();
//         System.out.print("enter the number of coloumns: ");
//         int c = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= c; j++) {
//                 if (i == 1 || i == r || j == 1 || j == c) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// Q3.half pyramid pattern
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the nuber of rows: ");
//         int r = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//Q4 . inverted half pyramid pattern .
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enetr the number of rows: ");
//         int r = sc.nextInt();
//         for (int i = r; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//Q5. inverted half pyramid (rotated by 180 degree) pattern ..
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows: ");
//         int r = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= r - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//Q6 . half pyramid with numbers .pattern
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows: ");
//         int r = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//Q7 . inverted half pyramid using numbers pattern.
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the numner of rows: ");
//         int r = sc.nextInt();
//         for (int i = r; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//Q8 . floyd's triangle pattern
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows: ");
//         int r = sc.nextInt();
//         int num = 1;
//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }
//Q9. 0-1 triangle pattern
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows: ");
//         int r = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (i % 2 == 0) {
//                     System.out.print("1 ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//Q10 . 0-1 pattern
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows: ");
//         int r = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if ((i + j) % 2 == 0) {
//                     System.out.print("1 ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//Q11 . solid rhombus pattern..
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows for the solid rhombus: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//Q12 . number pyramid pattern
// import java.util.*;
// public class L5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows for the number pyramid: ");
//         int r = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             // Print spaces for pyramid shape
//             for (int j = 1; j <= r - i; j++) {
//                 System.out.print(" ");
//             }
//             // Print numbers with a space
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//Q13. pallindromic number pattern
import java.util.*;

public class L5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the palindromic number pattern: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // Print leading spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
