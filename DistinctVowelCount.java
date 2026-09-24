import java.util.*;
public class DistinctVowelCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if("aeiou".indexOf(c) !=-1){
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}