import java.util.*;
public class FirstLetterOnly {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char []c = s.toCharArray();
        String result="";
        result+=c[0];
        for(int i=1;i<c.length;i++){
            if(c[i-1]==' '){
                result+=c[i];
            }
        }
        System.out.println("First letter of each word : " + result);
    }
}