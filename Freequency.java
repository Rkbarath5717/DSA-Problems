import java.util.*;
public class Freequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int count []=new int[n];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(count[i] > 1){
                System.out.println(count[i]+ " -> "+i);
            }
        }
    }
}