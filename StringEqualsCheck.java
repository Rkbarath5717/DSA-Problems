import java.util.*;
public class StringEqualsCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1=scn.nextLine();
        String s2=scn.nextLine();
        int n = s1.length();
        if(n<2){
            return ;
        }
        String left = s1.substring(2)+s1.substring(0,2);

        String right=s1.substring(n-2)+s1.substring(0,n-2);

        if(left.equals(s2) || right.equals(s2)){
            System.out.print("yes");
        }
        else System.out.println("No");
    }
}