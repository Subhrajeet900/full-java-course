// This Java program demonstrates the use of different data types
// public class homeL2 {
//     public static void main(String[] args) {
//         int age = 21;                  // Age is a whole number
//         float height = 5.9f;           // Height in feet (decimal)
//         double weight = 68.5;          // Weight in kg (more precision)
//         char grade = 'A';              // Grade is a single character
//         boolean isStudent = true;      // True/false value
//         String name = "Subhrajeet";    // Name is a string of characters

//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Height: " + height + " ft");
//         System.out.println("Weight: " + weight + " kg");
//         System.out.println("Grade: " + grade);
//         System.out.println("Is Student: " + isStudent);
//     }
// }


//..........................................................................................................
// calculate the area of circle using user input......
// public class homeL2 {
//     public static void main(String[] args){
//         int radius = 10;
//         double pi =3.14;
//         double area = pi * radius * radius;
//         System.out.println("the area of the circle is : "+area );
//     }
// }

// make a program that prints the table of a number that is input by the user ....
import java.util.*;
public class homeL2 {
    public static void main(String[] args){
       try( Scanner sc = new Scanner(System.in)){
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        System.out.println("table of "+ num + ":");
        for (int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    
        sc.close();
    }
}
}