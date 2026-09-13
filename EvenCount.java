import java.util.*;
public class EvenCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s= scn.nextLine();
        char c[]=s.toCharArray();
        int place=1;
        int num=0;
        int even=0;
        for(int i = c.length-1;i>=0;i--){
            if(c[i]>='0' && c[i]<='9'){
                num=(c[i]-'0')+num*10;
                place=place*10;
            }
            else{
                if(place !=1){
                    if(num %2==0){
                        even++;
                        place=1;
                        num=0;
                    }
                }
            }
        }
        if(place !=1 && num %2==0){
            even++;
        }
        System.out.println("Even number count is : " + even);
    }
}