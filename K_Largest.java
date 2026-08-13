import java.util.*;
public class K_Largest {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int arr []= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k =scn.nextInt();
        for(int i =0;i<n-1;i++){
            for(int j=1;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr[k-1]+ "   K th largest element in an array");
    }
}