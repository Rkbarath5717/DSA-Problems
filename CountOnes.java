import java.util.*;
public class CountOnes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='1'){
                count++;
            }
        }
        System.out.println(count*(count-1)/2);
    }
}