import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr.get(2)); //Print index No -2 Element

        arr.set(3,80);//Update Arralist index no -3 replace with 80

        System.out.println(arr);//Print Whole Arraylist

        int n=arr.size(); //yaha size likhte hai length nhi
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        arr.add(4,90); //insert element in array through index

        arr.remove(2); //remove element through index

        arr.remove(arr.size()-1); //remove last element
        
        for(int ele: arr){ //Print Arraylist through for each loop
            System.out.print(ele+" ");
        }
    }
}
