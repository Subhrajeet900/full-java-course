
// import java.util.Scanner;

// public class w {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the character: ");
//         char c = sc.next().charAt(0);
//         String a = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
//                 || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') ? "vowel" : "consonant";     //ternary operator
//         System.out.println(a);
//     }

// }

//precedence and associativity of operators
//type conversion - refers to the process of converting one data type to another.these are two types :
//1.implicit and 2.explicit type conversion .

//implicit
public class w{
    public static void main(String[] args) {
        int a = 10;
        double b = a; 
        System.out.println("Implicit type conversion: " + b);

        // explicit
        double c = 10.5;
        long d = (long) c;  
        System.out.println("Explicit type conversion: " + d);  // data loss
    }
}
