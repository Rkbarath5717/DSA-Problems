import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        // int sum=0;
        // for(int i=0;i<s.length();i++){
        //     char c = s.charAt(i);
        //     sum+=c;
        // }
        // System.out.println("The sum is " + sum);
        int max;
        for(int i=0;i<s.length();i++){
            max=s.charAt(0);
            if(s.charAt(i)>max){
                max=s.charAt(i);
            }
        }
        System.out.println(max);
    }
}