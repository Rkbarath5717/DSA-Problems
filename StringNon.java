import java.util.*;
public class StringNon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            count[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(count[c-'a']==1){
                System.out.println(c);
                break;
            }
        }
    }
}