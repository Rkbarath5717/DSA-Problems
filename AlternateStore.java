import java.util.*;
public class AlternateStore {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        String result="";
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        int i=0,j=0;
        while(i<a.length &&j<b.length){
            result+=a[i];
            result+=b[j];
            i++;
            j++;
        }
        while(i<a.length){
            result+=a[i];
            i++;
        }
        while(j<b.length){
            result+=b[j];
            j++;
        }
        System.out.println(result);
    }
}