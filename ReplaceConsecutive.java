import java.util.*;
public class ReplaceConsecutive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i) !=s.charAt(i-1)){
                sb.append(s.charAt(i));
            }
        }
        System.out.println("The final String is : " + sb.toString());
    }
}