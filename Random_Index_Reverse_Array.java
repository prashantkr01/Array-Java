import java.util.Scanner;

public class Random_Index_Reverse_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50,60,70,80};
        int num1=sc.nextInt();
        int num2=sc.nextInt();
       
        int start=num1;
        int end=num2;
        int temp=0;

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int ele : arr){
            System.out.print(ele+ " ");
        }
     sc.close();
    }
}
