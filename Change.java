import java.util.*;
public class Change {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char c[]= s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='a' && c[i]<='z'){
                c[i]=(char)('a'+'z'-c[i]);
            }
            else{
                c[i]=(char)('A'+'Z'-c[i]);
            }
        }
        System.out.println("Change  :  " + new String(c));
    }
}