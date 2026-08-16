import java.util.*;
public class FirstRepeation{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int p = map.get(c);
                map.put(c,p+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(map.get(b)> 1){
                System.out.println("First repeation character : " + b);
                return;
            }         
        }
        System.out.println("No character is there");
    }
}