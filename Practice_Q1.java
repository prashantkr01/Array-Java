//Multiply Odd Indexes elemnt by 2 and add 10 to even indexes elements?
public class Practice_Q1 {
    public static void main(String[] args) {
        int[] arr={5,74,88,95,74};

        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                System.out.print(arr[i]+10+" ");
            }else{
                System.out.print(arr[i]*2+" ");
            }
        }
    }
}
