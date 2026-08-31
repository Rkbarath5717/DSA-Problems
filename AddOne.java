import java.util.*;
public class AddOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr []=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                break;
            }
            arr[i]=0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(arr[0]==0){
            list.add(1);
            for(int i=0;i<n;i++){
                list.add(0);
            }
        }
        else{
            for(int i=0;i<n;i++){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}