// string builder ..........!

// strings are immutable , if once string date is stored in the memory then it can't be changable
// or delete from the memory , then we have to make the new string .
public class L12 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("subhrajeet");
        System.out.println(sb);

        // characcter at index 0
        System.out.println(sb.charAt(0));

        // set character at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //insert in the string
        sb.insert(0, 'r');
        System.out.println(sb);

        //delete in the string
        sb.delete(0, 5);
        System.out.println(sb);

        //append in the string
        sb.append("h");
        sb.append("b");
        sb.append("Q");
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
