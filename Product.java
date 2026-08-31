import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<20;i++){
            System.out.println(i + " x " + n + " = " + (i*n) );
        }
    }
}