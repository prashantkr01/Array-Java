public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr={24,58,69,73,18,60};

        int start=0;
        int end =arr.length-1;
        int temp=0;

        while(start < end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
