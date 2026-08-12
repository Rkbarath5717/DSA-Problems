import java.util.*;
public class FindGreaterThanNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int value = scn.nextInt();
        int found = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > value){
                found++;
            }
        }
        if(found > 0){
            System.out.println(found);
        }
        else{
            System.out.println("Not there");
        }
    }
}