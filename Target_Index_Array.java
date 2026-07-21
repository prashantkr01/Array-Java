import java.util.Scanner;

public class Target_Index_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Your Element = ");
        int target=sc.nextInt();
        boolean found= false;

        int[]arr={10,20,30,40,50,60};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Element Index is = "+i);
              found=true;
              break;
            }
        }
        if(found==false){
            System.out.println("Element Not found");
        }
      sc.close();
    }
}
