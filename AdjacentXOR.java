import java.util.*;
public class AdjacentXOR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int temp[]=new int[n];
        temp[0]=arr[0]^arr[1];
        for(int i=1;i<n-1;i++){
            temp[i]=arr[i-1]^arr[i+1];
        }
        temp[n-1]=arr[n-1]^arr[n-2];
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " -> ");
        }
    }
}