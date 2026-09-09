import java.util.*;
public class MaxNumberInString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int num=0;
        int max=-1;
        boolean digit=false;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                num=num * 10 + (c -'0');
                digit=true;
            }
            else{
                if(digit && num > max){
                    max=num;
                }
                num=0;
                digit=false;
            }
        }
        if(digit && num > max){
            max = num;
        }
        System.out.println("Maximum is : " + max);
    }
}