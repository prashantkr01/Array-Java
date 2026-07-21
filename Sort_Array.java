import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int[] arr={55,-3,4,98,-96,25};
        print(arr);//print function jo bnaya hai niche usko call kr dia usme array ko printing ka kam chal rha hai
        Arrays.sort(arr);//Built in method se array ko sort kia
        print(arr);//sort k bad fir se function call se array ko print kia
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
