import java.util.Arrays;
public class Practice_Q2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int [] abc={5,6,7,8,9};

        int total=arr.length+abc.length;
        int array[]=new int[total];

        for(int i=0; i<arr.length; i++){
            array[i]=arr[i];
        }
        for(int i=0; i<abc.length; i++){
            array[i+arr.length]=abc[i];
            
        }
        Arrays.sort(array);
        
        for(int ele : array){
            System.out.print(ele+" ");
        }

       // System.out.println(array.length);
    }
}
