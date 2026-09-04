import java.util.*;
public class MinimumDistance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k = scn.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int prev=map.get(arr[i]);
                int distance=i-prev;
                if(distance<=k){
                    System.out.println("yes");
                    return;
                }
            }
            map.put(arr[i],i);
        }
        System.out.println("No");
    }
}