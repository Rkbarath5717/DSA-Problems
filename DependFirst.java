import java.util.*;
public class DependFirst {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char c[] = s.toCharArray();
        if(c[0]>='a' && c[0]<='z'){
            for(int i=0;i<c.length;i++){
                if(c[i]>='A' && c[i]<='Z'){
                    c[i]=(char)(c[i]+32);
                }
            }
        }
        else{
            for(int i=0;i<c.length;i++){
                if(c[i]>='a' && c[i]<='z'){
                    c[i]=(char)(c[i]-32);
                }
            }
        }
        System.out.println("The final result is : " + new String(c));
    }
}