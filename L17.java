// recursion questions ...!
// 1 . Tower of Hanoi using recursion
// public class L17 {
// public static void towerOfHanoi(int n, String src, String helper, String dest) {
// if(n == 1) {
// System.out.println("transfer disk " + n + " from " + src + " to " + dest);
// return;
// }
// //transfer top n-1 from src to helper using dest as 'helper'
// towerOfHanoi(n-1, src, dest, helper);
// //transfer nth from src to dest
// System.out.println("transfer disk " + n + " from " + src + " to " + helper);
// //transfer n-1 from helper to dest using src as 'helper'
// towerOfHanoi(n-1, helper, src, dest);
// }
// public static void main(String args[]) {
// int n = 4;
// towerOfHanoi(n, "A", "B", "C");
// }
// }
//2 . print a string in reverse order .
// public class L17 {
//     public static void printReverse(String str, int index) {
//         if (index < 0) {
//             return;
//         }
//         System.out.print(str.charAt(index));
//         printReverse(str, index - 1);
//     }
//     public static void main(String[] args) {
//         String str = "SUBHRAJEET DASH";
//         printReverse(str, str.length() - 1);
//     }
// }
// 3 . find the occurance of the first and last occurance of an element using recursion .
// public class L17 {
//     public static int first = -1;
//     public static int last = -1;
//     public static void getIndices(String str, char el, int idx) {
//         if (idx == str.length()) {
//             return;
//         }
//         if (str.charAt(idx) == el) {
//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         getIndices(str, el, idx + 1);
//     }
//     public static void main(String[] args) {
//         String str = "SUBHRAJEET DASH";
//         char el = 'A';
//         getIndices(str, el, 0);
//         System.out.println("First Occurrence: " + first);
//         System.out.println("Last Occurrence: " + last);
//     }
// }
//4 . check if an array is sorted (strictly increasing) . O(n) time complexity.
// public class L17 {
//     public static boolean checkIfIncreasing(int arr[], int idx) {
//         if (idx == arr.length - 1) {
//             return true;
//         }
//         if (!checkIfIncreasing(arr, idx + 1)) {
//             return false;
//         }
//         return arr[idx] < arr[idx + 1];
//     }
//     public static void main(String args[]) {
//         int arr1[] = {1, 2, 3, 4, 5};
//         int arr2[] = {1, 6, 3, 4, 5};
//         if (checkIfIncreasing(arr2, 0)) {
//             System.out.println("Strictly Increasing");
//         } else if (checkIfIncreasing(arr1, 0)) {
//             System.out.println("NOT Strictly Increasing");
//         }
//     }
// }
// 5 . move all 'x' to the end of the string - O(n) time complexity.
// public class L17 {
//     public static String addX(int count) {
//         String newstr = "x";
//         for (int i = 1; i < count; i++) {
//             newstr += "x";
//         }
//         return newstr;
//     }
//     public static String moveALLX(String str, int idx, int count) {
//         if (idx == str.length()) {
//             return addX(count);
//         }
//         if (str.charAt(idx) == 'x') {
//             return moveALLX(str, idx + 1, count + 1);
//         } else {
//             String nextString = moveALLX(str, idx + 1, count);
//             return str.charAt(idx) + nextString;
//         }
//     }
//     public static void main(String args[]) {
//         String str = "abcdefxghxixjxxxk";
//         int count = 0;
//         String newStr = moveALLX(str, 0, count);
//         System.out.println(newStr);
//     }
// }
//Print all the subsequences of a string. O(2^n) time complexity.
// public class L17 {
//     public static void printSubseq(String str, int idx, String res) {
//         if (idx == str.length()) {
//             System.out.println(res);
//             return;
//         }
// //choose
//         printSubseq(str, idx + 1, res + str.charAt(idx));
// //don't choose
//         printSubseq(str, idx + 1, res);
//     }
//     public static void main(String args[]) {
//         String str1 = "abc";
//         String str2 = "aaa";
//         printSubseq(str1, 0, "");
//     }
// }

//Print all unique subsequences of a string.

// import java.util.HashSet;

// public class L17 {

//     public static void printSubseq(String str, int idx, String res, HashSet<String> allSubseq) {
//         if (idx == str.length()) {
//             if (allSubseq.contains(res)) {
//                 return;
//             }
//             allSubseq.add(res);
//             System.out.println(res);
//             return;
//         }
// //choose
//         printSubseq(str, idx + 1, res + str.charAt(idx), allSubseq);
// //don't choose
//         printSubseq(str, idx + 1, res, allSubseq);
//     }

//     public static void main(String args[]) {
//         String str1 = "abc";
//         String str2 = "aaa";
//         HashSet<String> allSubseq = new HashSet<>();
//         printSubseq(str2, 0, "", allSubseq);
//     }
// }

//Print keypad combination
//( 0 -> .;

//1 -> abc
//2 -> def
//3 -> ghi
//4 -> jkl
//5 -> mno
//6 -> pqrs
//7 -> tu
//8 -> vwx
//9 -> yz
//)
// public class L17 {
//     public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
//         "tu", "vwx", "yz"};
//     public static void printKeypadCombination(String number, int idx, String res) {
//         if (idx == number.length()) {
//             System.out.println(res);
//             return;
//         }
//         for (int i = 0; i < keypad[number.charAt(idx) - '0'].length(); i++) {
//             char curr = keypad[number.charAt(idx) - '0'].charAt(i);
//             printKeypadCombination(number, idx + 1, res + curr);
//         }
//     }
//     public static void main(String args[]) {
//         String number = "23";
//         printKeypadCombination(number, 0, "");
//     }
// }
