
import java.util.*;

public class questionL3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            int sub = a - b;
            int product = a * b;
            int div = a / b;
            int mod = a % b;
            System.out.println("sum =" + sum);
            System.out.println("sub = " + sub);
            System.out.println("product = " + product);
            System.out.println("div = " + div);
            System.out.println("mod = " + mod);
        }

    }
}
