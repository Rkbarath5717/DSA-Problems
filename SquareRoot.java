import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int left=1;
        int right=n;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid<=n/mid){
                ans=mid;
                left=left+mid;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println("The root value is : " + ans);
    }
}