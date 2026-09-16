import java.util.*;
public class MoreCount{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']>1){
                System.out.println(s.charAt(i));
                break;
            }
        }
        System.out.println("No character is there");
    }
}