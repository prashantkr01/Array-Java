public class Search_Elements_In_Array {
    public static void main(String[] args) {
        int x=20;
        boolean a = false;
        int[] arr={10,20,30,40,50};

        for(int i=0; i<arr.length; i++){
            if(x==arr[i]){
             a=true;

            }
        }
        if(a == true)
            System.out.println("Element Found");
        else
            System.out.println("Elemets Not Found");
    }
}
