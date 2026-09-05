import java.util.*;
public class MaximumSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            while(arr[i]>0){
                int digit=arr[i]%10;
                sum+=arr[i];
                arr[i]=arr[i]/10;
            }
        }
        if(sum%3==0){
            System.out.println("yes");
            return;
        }
        System.out.println("No");
    }
}