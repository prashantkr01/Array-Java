public class Two_Sum {
    public static void main(String[] args) {
        int target=2;
        int [] arr={1,3,4,6,-3,5};
        int[] ind=new int[2];

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    ind[0]=i;
                    ind[1]=j;
                }
            }
        }
        for(int ele:ind){
            System.out.print(ele+" ");
        }
    }
}
