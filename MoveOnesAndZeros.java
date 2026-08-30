import java.util.*;
public class MoveOnesAndZeros {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[index]=0;
                index++;
            }
        }
        while(index<n){
            arr[index]=1;
            index++;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}