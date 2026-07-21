public class Second_Maximum_Element_Array {
    public static void main(String[] args) {
        int[] arr={44,52,87,96,37,44};

        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>secmax && arr[i]!=max){
            secmax=arr[i];
            }
        }
        System.out.println("Second Maximun = "+secmax);
    }
}
