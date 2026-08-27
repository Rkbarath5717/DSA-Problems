import java.util.*;
public class Checking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        if(s1.length() != s2.length()){
            System.out.println("Not anagaram");
            return;
        }
        int count[] = new int [26];
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            count[c-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            count[c-'a']--;
        }
        boolean anagram = true;
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                anagram=false;
            }
        }
        if(anagram){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}