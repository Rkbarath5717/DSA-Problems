import java.util.*;
public class SecondMaximum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            count[c-'a']++;
        }
        int max = 0;
        for(int i=0;i<26;i++){
            if(count[i] > max){
                max = count[i];
                char maxChar = (char) (i+'a');
                System.out.println(maxChar);
            }
        }
        int second =0;
        for(int i=0;i<26;i++){
            if(count[i] > second && count[i] < max){
                second = count[i];
            }
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(count[c-'a']==second){
                System.out.println(c);
                break;
            }
        }
    }
}