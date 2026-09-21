import java.util.*;
public class NumberInDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n=scn.nextInt();
        int d=scn.nextInt();
        for(int i=0;i<=n;i++){
            int num=i;
            while(num>0){
                int digit=num % 10;
                if(digit==d){
                    list.add(i);
                    break;
                }
                num/=10;
            }
        }
        System.out.println(list);
    }
}