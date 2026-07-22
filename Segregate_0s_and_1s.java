public class Segregate_0s_and_1s {
    public static void main(String[] args) {
        int[] arr={0,0,1,0,1,1,0,1};
        int numberofzero=0;
        int numberofone=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                numberofzero++;
            }else{
                numberofone++;
            }
        }
        System.out.println(numberofone +" "+ numberofzero);
        for(int i=0; i<arr.length; i++){
            if(i<numberofzero){
               arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
