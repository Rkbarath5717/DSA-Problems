import java.util.*;
public class ConcateAndReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        String original = sb.reverse().toString();
        System.out.println("Original is : " + original);
    }
}