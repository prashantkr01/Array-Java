import java.util.Arrays;

public class Copy_Array {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int [] copy=Arrays.copyOf(arr,arr.length);//ye array ka copy hai jisme changes kr skte hai
        copy[0]=100;
        System.out.println(arr[0]);
        System.out.println(copy[0]);

    }
}
