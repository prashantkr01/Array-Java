import java.util.Arrays;
public class Find_Missing_Number {
    public static void main(String[] args) {
        int [] arr={0, 2, 3, 1, 4};
       
        Arrays.sort(arr);
       
        int n=arr.length;
        int num=n;
        
        for(int i=0; i<n; i++){
            if(arr[i]!=i){
              num=i;
              break;
            }
        }
        System.out.println(num);
    }
}
