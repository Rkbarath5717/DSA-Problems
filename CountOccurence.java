import java.util.*;
public class CountOccurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int value = scn.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==value){
                count++;
            }
        }
        if(count > 1){
            System.out.println("The number occure in  " + count +" times ");
        }
        else{
            System.out.println("Not occur in the given array");
        }
    }
}