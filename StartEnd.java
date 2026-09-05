import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int start=scn.nextInt();
        int end =scn.nextInt();
        int count[]=new int[end+1];
        for(int i=0;i<n;i++){
            if(arr[i]<=end){
                count[arr[i]]++;
            }
        }
        for(int i=start;i<=end;i++){
            if(count[i]==0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}