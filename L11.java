// strings........!

// import java.util.*;
public class L11 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("your name is : " + name);

        //concatenation..........
        // String firstName = "subhrajeet";
        // String lastName = "dash";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // //string length.
        // System.out.println(fullName.length());
        // //charAt.......
        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }
        //compare........
        // String name1 = "subhrajeet";
        // String name2 = "aubhrajeet";
        //1. string1 > string2 : +ve value
        //2. string2 == string2 : 0
        //3. string3 < string2 : -ve value
        // if(name1.conpareTo(name2)== 0){
        //      System.out.println("strings are equal");                         //(DOUBT)
        // }else{
        //     System.out.println("strings are not equL");
        // }
        //or
        // if (name1 == name2) {
        //     System.out.println("strings are equal");
        // } else {
        //     System.out.println("strings are not equL");
        // }
        //
        //or
        // if (new String("subhrajeet") == new String("subhrajeet")) {              //showing yellow error
        //     System.out.println("strings are equal");
        // } else {
        //     System.out.println("strings are not equal");
        // }
        String sentence = "my name is subhrajeet";
        // substring(beg index , end index)                                         // showing error
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}



// concept of parcing in strings .....
