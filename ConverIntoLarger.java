import java.util.*;
public class ConverIntoLarger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int ans=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            if(ans<=1 || c<=1){
                ans+=c;
            }
            else{
                ans*=c;
            }
        }
        System.out.println("The largest Number is : " + ans);
    }
}