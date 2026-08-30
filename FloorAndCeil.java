import java.util.*;
public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int num = scn.nextInt();
        int small=-1;
        int high = -1;
        for(int i=0;i<n;i++){
            if(arr[i] <= num && arr[i] >=small){
                small = arr[i];
            }
            if(arr[i]>=num && (high ==-1 || arr[i] < high)){
                high = arr[i];
            }
        }
        System.out.println(high);
        System.out.println(small);
    }
}