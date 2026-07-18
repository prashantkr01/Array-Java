import java.util.Scanner;

public class Array_Double {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //input
        int[] arr=new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        //output
        for(int i=0; i<arr.length; i++){
            System.out.print(2*arr[i]+ " ");
        }
        sc.close();
    }
}
