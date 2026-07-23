import java.util.ArrayList;

public class Arrat_List_Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        int start=0;
        int end=arr.size()-1;
        int temp=0;

        for(int i=0; i<arr.size()/2; i++){
            temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;

        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
