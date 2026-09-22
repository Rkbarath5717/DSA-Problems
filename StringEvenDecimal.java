import java.util.*;
public class StringEvenDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)=='0'){
            i--;
        }
        if(s.charAt(i)=='.'){
            i--;
        }
        char c = s.charAt(i);
        int digit=c-'0';
        if(digit%2==0){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}