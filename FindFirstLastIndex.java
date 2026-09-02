import java.util.*;
public class FindFirstLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int key = scn.nextInt();
        int first = -1;
        int last = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        list.add(first);
        list.add(last);
        System.out.println(list);
    }
}