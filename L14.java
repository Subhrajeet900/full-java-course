// bit manipulation.........!

// public class L14 {
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 2;
//         int bitMask = 1 << pos;
//         if ((bitMask & n) == 0) {
//             System.out.println("bit was zero");
//         } else {
//             System.out.println("bit was one");
//         }
//     }
// }
// public class L14 {
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 1;
//         int bitMask = 1 << pos;
//         if ((bitMask | n) == 0) {
//             System.out.println("bit was zero");
//         } else {
//             System.out.println("bit was one");
//         }
//     }
// }
// public class L14 {
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 1;
//         int bitMask = 1 << pos;
//         int notbitMask = ~bitMask;
//         if ((notbitMask | n) == 0) {
//             System.out.println("bit was zero");
//         } else {
//             System.out.println("bit was one");
//         }
//     }
// }
import java.util.Scanner;

public class L14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt(); // 1 for set, 0 for clear
        int n = 5;
        int pos = 1;

        if (operation == 1) {
            int bitMask = 1 << pos;
            int orbitMask = bitMask | n;
            System.out.println("After setting bit: " + orbitMask);
        } else {
            int bitMask = 1 << pos;
            int notbitMask = ~bitMask;
            int andbitMask = notbitMask & n;
            System.out.println("After clearing bit: " + andbitMask);
        }
    }
}
