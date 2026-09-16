import java.util.*;
public class MakePalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        int odd=0;
        for(int i=0;i<26;i++){
            if(count[i] %2 !=0){
                odd++;
            }
        }
        if(odd<=1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}