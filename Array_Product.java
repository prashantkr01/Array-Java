import java.util.Scanner;

public class Array_Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int product=1;
        int[] arr=new int[5];
        
        System.out.print("Enter Your Elements = ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            product= product*arr[i];
        }
        System.out.println("Total Product = "+product);
        sc.close();
    }
}
