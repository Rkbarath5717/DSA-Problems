import java.util.*;
public class CompareString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        int i=0;
        int j=0;
        while(i<s1.length()-1 && s1.charAt(i)=='0'){
            i++;
        }
        while(j<s2.length()-1 && s2.charAt(j)=='0'){
            j++;
        }
        if(s1.length()-i < s2.length()-j){
            System.out.println("1");
        }
        if(s1.length()-i > s2.length()-j){
            System.out.println("2");
        }
        while(i<s1.length()){
            if(s1.charAt(i)<s2.charAt(j)){
                System.out.println("1");
            }
            if(s1.charAt(i)>s2.charAt(j)){
                System.out.println("2");
            }
            i++;
            j++;
        }
        System.out.println("3");
    }
}