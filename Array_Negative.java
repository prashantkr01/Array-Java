import java.util.Scanner;

public class Array_Negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={5,88,-9,-8,77,-6,5};
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
