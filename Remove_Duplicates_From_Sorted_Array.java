public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int [] arr ={-30,-30,0,0,10,20,30,30};
        int m=0;
        for(int i=1; i<arr.length; i++){
            if(arr[m]!=arr[i]){
            m++;
            arr[m]=arr[i];
            }
        }
        System.out.println("Number of unique element ="+ (m+1));
        for(int i=0; i<=m; i++){
            System.out.println(arr[i]);
        }
        }
}


