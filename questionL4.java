// all the even number till n :-

import java.util.*;

public class questionL4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            System.out.println("Even numbers till " + n + ":");
            for (int i = 2; i <= n; i += 2) {
                System.out.println(i);
            }
            sc.close();
        }
    }
}
