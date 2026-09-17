import java.util.*;
public class CheckDivide {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int n=s.length();
        int last=((s.charAt(n-2)-'0')*10+(s.charAt(n-1)-'0'));
        if(last %4==0){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}