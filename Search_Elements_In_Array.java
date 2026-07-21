public class Search_Elements_In_Array {
    public static void main(String[] args) {
        int target =20;
        boolean flag = false;
        int[] arr={10,20,30,40,50};

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
             flag=true;

            }
        }
        if( flag== true)
            System.out.println("Element Found");
        else
            System.out.println("Elemets Not Found");
    }
}
