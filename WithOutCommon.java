import java.util.*;
public class WithOutCommon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1=scn.nextLine();
        String s2=scn.nextLine();
        int [] f=new int[26];
        for(int i=0;i<s2.length();i++){
            f[s2.charAt(i)-'a']++;
        }
        String result="";
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(f[c-'a']==0){
                result+=c;
            }
        }
        int f2[] = new int[26];
        for(int i=0;i<s1.length();i++){
            f2[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(f2[c-'a']==0){
                result+=c;
            }
        }
        if(result.length()==0){
            System.out.println("All are the common");
        }
        System.out.println(result);
    }
}