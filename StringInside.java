import java.util.*;
public class StringInside {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String p=scn.nextLine();
        for(int i=0;i<s.length();i++){
            int j=0;
            while(j<p.length() && s.charAt(i+j)==p.charAt(j)){
                j++;
            }
            if(j==p.length()){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Not there");
    }
}