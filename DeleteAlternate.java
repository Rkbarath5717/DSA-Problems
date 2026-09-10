import java.util.*;
public class DeleteAlternate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String result="";
        char []c = s.toCharArray();
        for(int i =0;i<c.length;i++){
            if(i%2==0){
                result+=c[i];
            }
        }
        System.out.println(result);
    }
}