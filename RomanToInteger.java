import java.util.*;
public class RomanToInteger {

    public static int value(char c){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X') return 10;

        return 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int result=0;
        for(int i=0;i<s.length();i++){
            int current=value(s.charAt(i));
            if(i+1<s.length()){
                int next=value(s.charAt(i+1));
                if(current<next){
                    result-=current;
                }
                else{
                    result+=current;
                }
            }
            else{
                result+=current;
            }
        }
        System.out.println("The final result is : " + result);
    }
}