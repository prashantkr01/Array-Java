public class Max_to_End {
    public static void main(String[] args) {
        int [] arr={2,0,2,1,1,0};
        int zero=0;
        int one=0; 
        int two=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
                zero++;
            else if(arr[i]==1)
                one++;
            else
                two++;
        }
       
    int i=0;
       while(zero>0){
        arr[i]=0;
        zero--;
        i++;
       }
       while(one>0){
        arr[i]=1;
        one--;
        i++;
       }
       while(two>0){
        arr[i]=2;
        two--;
        i++;
       }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
