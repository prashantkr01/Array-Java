import java.util.Scanner;

public class Minimum_Element_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];55
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Number = "+min);
        sc.close();
    }
}
