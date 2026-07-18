import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        
        System.out.print("How Many Elements You Wats to Enter = ");
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        System.out.print("Enter Your Elements = ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("Total Sum = "+ sum);
        sc.close();
    }
}
