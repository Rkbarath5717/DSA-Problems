import java.util.*;
public class CountNumbersString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char[] c= s.toCharArray();
        int num=0;
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>='0' && c[i]<='9'){
                num=num*10+(c[i]-'0');
            }
            else{
                if(num !=0){
                    count++;
                    num=0;
                }
            }
        }
        if(num !=0){
            count++;
        }
        System.out.println("The Count is : " + count);
    }
}