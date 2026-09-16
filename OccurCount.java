import java.util.*;
public class OccurCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int k=scn.nextInt();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i) != s.charAt(i-1)){
                count[s.charAt(i)-'a']++;
            }
        }
        int occur=0;
        for(int i=0;i<26;i++){
            if(count[i]==k){
                occur++;
            }
        }
        System.out.println(occur);
    }
}