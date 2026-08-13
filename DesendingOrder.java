import java.util.*;
public class DesendingOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr []= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int max=i;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}