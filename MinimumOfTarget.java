import java.util.*;
public class MinimumOfTarget {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                System.out.println(arr[i]+  " -> "  + i);
                break;
            }
            else{
                System.out.println(n +"   The index  is not found");
            }
        }
    }
}