import java.util.*;
public class Critical {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(!list.contains(c)){
                list.add(c);
            }
        }
        for(int i=0;i<list.size();i++){
            char c = list.get(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(c==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(c);
                break;
            }
        }
       
    }
}