import java.util.*;
public class SecondAndSmallest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] < smallest){
                second=smallest;
                smallest=arr[i];
            }
            else if(arr[i] > smallest && arr[i] < second){
                second=arr[i];
            }
        }
        if(second==Integer.MAX_VALUE){
            System.out.println("Not found");
        }
        System.out.println(smallest);
        System.out.println(second);
    }
}