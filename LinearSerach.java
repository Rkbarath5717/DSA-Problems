import java.util.*;
public class LinearSerach {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int key = scn.nextInt();
        int position = -1;

        for(int i=0;i<n;i++){
            if(arr[i]==key){
                position=i;
                break;
            }
        }
        if(position == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at the position of  : " + position);
        }
    }
}