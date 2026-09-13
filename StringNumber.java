import java.util.*;
public class StringNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char c[]=s.toCharArray();
        int num=0;
        int sum=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>='0' && c[i]<='9'){
                num=num*10+(c[i]-'0');
            }
            else{
                if(num !=0){
                    sum+=num;
                    num=0;
                }
            }
        }
        if(num!=0){
            sum+=num;
        }
        System.out.println("The total sum = " + sum);
    }
}