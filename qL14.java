// bit manipulation to check if a number is a power of 2

import java.util.Scanner;

public class qL14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Bit manipulation: n > 0 and n & (n-1) == 0 means power of 2
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is NOT a power of 2.");
        }
    }
}
// Bit manipulation to toggle a bit at a specific position in a number..
// import java.util.Scanner;
// public class qL14 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number (n): ");
//         int n = sc.nextInt();
//         System.out.print("Enter the position to toggle (pos, 0-based): ");
//         int pos = sc.nextInt();
//         int bitMask = 1 << pos;
//         int toggledNumber = n ^ bitMask; // XOR toggles the bit at position pos
//         System.out.println("Number after toggling bit at position " + pos + ": " + toggledNumber);
//     }
// }
// Count the number of 1's in the binary representation of a number
// import java.util.Scanner;

// public class qL14 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int count = 0;
//         while (n != 0) {
//             if ((n & 1) == 1) {
//                 count++;
//             }
//             n = n >> 1;
//         }
//         System.out.println("Number of 1's in binary representation: " + count);
//     }
// }
// Decimal to Binary and Binary to Decimal conversion using bit manipulation..
// import java.util.Scanner;
// public class qL14 {
//     // Function to convert decimal to binary (returns String)
//     public static String decimalToBinary(int n) {
//         StringBuilder binary = new StringBuilder();
//         if (n == 0) return "0";
//         while (n > 0) {
//             binary.insert(0, n % 2);
//             n = n / 2;
//         }
//         return binary.toString();
//     }
//     // Function to convert binary (as String) to decimal (returns int)
//     public static int binaryToDecimal(String binary) {
//         int decimal = 0;
//         int power = 0;
//         for (int i = binary.length() - 1; i >= 0; i--) {
//             int bit = binary.charAt(i) - '0';
//             decimal += bit * Math.pow(2, power);
//             power++;
//         }
//         return decimal;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // Decimal to Binary
//         System.out.print("Enter a decimal number: ");
//         int dec = sc.nextInt();
//         System.out.println("Binary: " + decimalToBinary(dec));
//         // Binary to Decimal
//         System.out.print("Enter a binary number: ");
//         String bin = sc.next();
//         System.out.println("Decimal: " + binaryToDecimal(bin));
//     }
// }
