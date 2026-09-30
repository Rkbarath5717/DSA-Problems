import java.util.*;
public class RemoveDuplicateUpperLower{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean a[]=new boolean[256];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!a[c]){
                sb.append(c);
                a[c]=true;
            }
        }
        System.out.println(sb.toString());
    }
}