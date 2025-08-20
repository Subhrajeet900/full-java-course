// Arrays in java

// public class L9 {
//     public static void main(String[] args) {
//         int marks[] = {10, 98, 99};
//         // int[] marks = new int[3];                      <-  or
//         // marks[0] = 90;
//         // marks[1] = 99;
//         // marks[2] = 98;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);                  or  ->
//         for (int i = 0; i < 3; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }
// import java.util.*;
// public class L9 {                   //default initialization
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int marks[] = new int[size];
//         //input
//         for (int i = 0; i < size; i++) {
//             marks[i] = sc.nextInt();
//         }
//         //output
//         for (int i = 0; i < size; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }
// Q -> take an array as input from the user . search for a given
//      number x and print the index at which it ouccurs         or (Linear search)
// import java.util.*;
// public class L9 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the array size : ");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         // input
//         for (int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt();
//         }
//         System.out.print("enter the number to find : ");
//         int x = sc.nextInt();
//         // output
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == x) {
//                 System.out.println("the number found at index : " + i);
//             }
//         }
//     }
// }

