import java.util.*;
public class MaximumInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextLine();
        }
        int max=0;
        String word="";
        for(int i=0;i<n;i++){
            if(arr[i].length()>max){
                max=arr[i].length();
                word=arr[i];
            }
        }
        System.out.println("The longes word is = " + word);
    }
}