import java.util.*;
public class Most {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        int max=0;
        char l='a';
        for(int i=0;i<26;i++){
            if(count[i]>max){
                max=count[i];
                l=(char)(i+'a');
            }
        }
        System.out.println("max letter: " + l);
    }
}