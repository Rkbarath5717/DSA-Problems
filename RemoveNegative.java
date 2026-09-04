import java.util.*;
public class RemoveNegative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k = scn.nextInt();
        for(int i=0;i<n && k>0;i++){
            if(arr[i]<0){
                arr[i]=-arr[i];
                k--;
            }
        }
        int sum =0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]<min){
                min=arr[i];
            }
        }
        if(k%2==0){
            sum = sum - 2*min;
        }
        System.out.println("Total sum "  +sum);
    }
}