import java.util.*;
public class RemoveCharBetweenCon{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(i>0 && i<s.length()-1&&
            "aeiou".indexOf(c) !=-1&&
            "aeiou".indexOf(s.charAt(i-1))==-1&&
            "aeiou".indexOf(s.charAt(i+1))==-1){
                continue;
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}