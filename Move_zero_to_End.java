public class Move_Zero_to_End {
    public static void main(String[] args) {
        int j=0;
        int [] arr={0,1,4,0,5,2};
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              j++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
