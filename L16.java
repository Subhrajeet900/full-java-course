// recursion ....!
// number 5 to 1
// public class L16 {
//     public static void printNumb(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n - 1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumb(n);
//     }
// }

// number 1 to 5
// public class L16 {
//     public static void printNumb(int n) {
//         if (n == 6) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n + 1);
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printNumb(n);
//     }
// }
// sum of the first n natural number .
// public class L16 {
//     public static void printSum(int i, int n, int sum) {
//         if (n == i) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         printSum(i + 1, n, sum);
//         System.out.println(i); // for print the i
//     }
//     public static void main(String[] args) {
//         printSum(1, 10, 0);
//     }
// }
// factorial of a number using recursion
// public class L16 {
//     public static void printFactorial(int n, int fact) {
//         if (n == 0 || n == 1) {
//             System.out.println(fact);
//             return;
//         }
//         fact *= n;
//         printFactorial(n - 1, fact);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printFactorial(n, 1);
//     }
// }
// Fibonacci series using recursion
// public class L16 {
//     public static int printFibonacci(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         if (n == 1) {
//             return 1;
//         }
//         return printFibonacci(n - 1) + printFibonacci(n - 2);
//     }
//     public static void main(String[] args) {
//         int n = 13; // Change this value to get more Fibonacci numbers
//         for (int i = 0; i <= n; i++) {
//             System.out.print(printFibonacci(i) + " ");
//         }
//     }
// }

// print x^n (stack height =n)
// public class L16 {

//     public static int power(int x, int n) {
//         if (x == 0) {
//             return 0;
//         }
//         if (n == 0) {
//             return 1; // Base case: x^0 = 1
//         }
//         return x * power(x, n - 1); // Recursive case
//     }
//     public static void main(String[] args) {
//         int x = 5; // Base
//         int n = 9; // Exponent
//         System.out.println("base " + "= " + x);
//         System.out.println("exponent " + "= " + n);
//         System.out.println("The value of " + x + "^" + n + " is: " + power(x, n));
//     }
// }
// print x^n (stack height = log n).
// print x^n (stack height = log n) using fast exponentiation
// public class L16 {
//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1; // Base case: x^0 = 1
//         }
//         // If n is even
//         if (n % 2 == 0) {
//             int halfPower = power(x, n / 2);
//             return halfPower * halfPower;
//         } else { // If n is odd
//             int halfPower = power(x, n / 2);
//             return x * halfPower * halfPower;
//         }
//     }
//     public static void main(String[] args) {
//         int x = 5; // Base
//         int n = 9; // Exponent
//         System.out.println("base = " + x);
//         System.out.println("exponent = " + n);
//         System.out.println("The value of " + x + "^" + n + " is: " + power(x, n));
//     }
// }

