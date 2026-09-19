import java.util.*;
public class RemoveRepeatedDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long ans=0;
        long place=1;
        long previous=-1;
        while(n>0){
            long digit=n%10;
            n=n/10;

            if(digit != previous){
                ans=ans+digit*place;
                place=place*10;
            }
            previous=digit;
        }
        System.out.println("The final answer : " + ans);
    }
}