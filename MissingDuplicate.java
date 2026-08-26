import java.util.*;
public class MissingDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int count []=new int[n+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int missing = -1;
        int duplicate = -1;
        for(int i=1;i<=n;i++){
            if(count[i]==0){
                missing=i;
                System.out.println("Missing ");
                System.out.println(i  +  "  ->  " +count[i]);
            }
            if(count[i] > 1){
                duplicate = i;
                System.out.println("Duplicate ");
                System.out.println(i + " -> " +count [i]);
            }
        }
    }
}