import java.util.*;
public class FindDifference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        int k=scn.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]==k){
                    count++;
                }
                if(arr[j]-arr[i]>k){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}