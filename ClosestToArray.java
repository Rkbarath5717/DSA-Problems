import java.util.*;
public class ClosestToArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int closest=arr[0];
        int minDiff = Math.abs(arr[0]-k);
        for(int i=1;i<n;i++){
            int diff = Math.abs(arr[i]-k);
            if(diff < minDiff){
                minDiff=diff;
                closest=arr[i];
            }
            else if(diff==minDiff && arr[i]>closest){
                closest=arr[i];
            }
        }
        System.out.println(closest);
    }
}