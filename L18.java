
// class pen {
//     String color;
//     int type;
//     public void write() {
//         System.out.println("write something");
//     }
//     public void printInfo() {
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
//     pen() {
//         // handle to not get error in p1 in main function
//     }
//     pen(pen p2) {
//         this.color = p2.color;
//         this.type = p2.type;
//     }
// }
// public class L18 {
//     public static void main(String[] args) {
//         pen p1 = new pen();
//         p1.color = "black";
//         p1.type = 20;
//         pen p2 = new pen(p1);
//         p1.write();
//         p1.printInfo();
//     }
// }
class shape {

    public void area() {
        System.out.print("area of shape : ");
    }
}

class Rectangle extends shape {

    public void area(int l, int b) {
        System.out.print(l * b);
    }
}

public class L18 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
        r1.area(10, 20);

    }
}
