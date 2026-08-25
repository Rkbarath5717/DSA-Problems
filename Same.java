import java.util.*;
public class Same {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scn.nextInt();
        int a[]= new int [n];
        int b[]= new int [n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            list.add(a[i]);
        }
        boolean same = true;
        for(int i=0;i<n;i++){
            if( !list.contains(b[i])){
            same = false;
            break;
        }
        }
        if(same){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}