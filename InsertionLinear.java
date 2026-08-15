import java.util.*;
public class InsertionLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target = scn.nextInt();
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        int position = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                position=i+1;
                break;
            }
        }
        if(position == -1){
            System.out.print("Element is not found");
        }
        else{
            System.out.print("Element is found at the position of  "+ position + " ");
        }
    }
}