import java.util.*;
public class MaximumForMin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            if(sum<=(long)n * arr[i]){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }
        System.out.println("Min value = " + min);
    }
}