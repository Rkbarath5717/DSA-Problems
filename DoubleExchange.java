import java.util.*;
public class DoubleExchange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int l=scn.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==l){
                l=l*5;
            }
        }
        System.out.println("The final value is : " + l);
    }
}