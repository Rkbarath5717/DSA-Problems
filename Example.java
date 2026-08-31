import java.util.*;
public class Example {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=1;i<n-1;i++){
            boolean left = true;
            boolean right = true;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    left = false;
                    break;
                }
            }
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    right=false;
                    break;
                }
            }
            if(left && right){
            System.out.println(arr[i]);
            }
        }
    }
}