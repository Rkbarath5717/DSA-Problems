import java.util.*;
public class ReverseWithDot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder();
        String arr[]=s.split("\\.+");
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].isEmpty()){
                if(sb.length()>0){
                    sb.append('.');
                }
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}