import java.util.*;
public class LeftLesserRightGreater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int leftMax[] = new int[n];
        int rightMin[] = new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        rightMin[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMin[i]=Math.min(rightMin[i+1],arr[i]);
        }
        for(int i=1;i<n-1;i++){
            if(leftMax[i-1] <=arr[i] && arr[i] <= rightMin[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}