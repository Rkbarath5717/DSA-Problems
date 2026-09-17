import java.util.*;
public class GoodBad {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='?'){
                vowel++;
                consonant++;
            }
            else if("aeiou".indexOf(c) != -1){
                vowel++;
                consonant=0;
            }
            else{
                consonant++;
                vowel=0;
            }
        }
        if(vowel > 5 || consonant >3){
            System.out.println("Bad");
        }
        else{
            System.out.println("Good");
        }
    }
}