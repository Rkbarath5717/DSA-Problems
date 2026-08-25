import java.util.*;
public class MissingFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=scn.nextInt();
        }
        int count []=new int [n+1];
        for(int i=0;i<n-1;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==0){
                System.out.println(i + " :  index ");
            }
        }
    }
}