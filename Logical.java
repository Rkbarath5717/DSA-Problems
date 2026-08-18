import java.util.*;
public class Logical {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = arr[i];

            if(m.containsKey(num)){
                int p = m.get(num);
                m.put(num,p+1);
            }
            else{
                m.put(num,1);
            }
        }
        for(int en : m.keySet()){
            int count=m.get(en);

            if(count==1){
                System.out.print(en);
            }
        }
    }
}