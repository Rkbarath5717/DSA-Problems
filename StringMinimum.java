import java.util.*;
public class StringMinimum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int k = scn.nextInt();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        while(k>0){
            int maxIndex=0;
            for(int i=1;i<26;i++){
                if(count[i]>count[maxIndex]){
                    maxIndex=i;
                }
            }
            if(count[maxIndex]==0){
                break;
            }
            count[maxIndex]--;
            k--;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=count[i]*count[i];
        }
        System.out.println(ans);
    }
}