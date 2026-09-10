import java.util.*;
public class FirstCapital {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char c[]=s.toCharArray();
        if(c[0]>='a'&&c[0]<='z'){
            c[0]=(char)(c[0]-32);
        }
        for(int i=1;i<c.length;i++){
            if(c[i-1]==' '){
                if(c[i]>='a' && c[i]<='z'){
                    c[i]=(char)(c[i]-32);
                }
            }
        }
        System.out.println(c[i]);
    }
}