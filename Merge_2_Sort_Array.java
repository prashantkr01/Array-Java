//Merge two sorted array in a single big array
public class Merge_2_Sort_Array {
    public static void main(String[] args) {
    int [] a={2,4,6,9,20};
    int [] b={1,3,4,5,7,8}; 
    int [] arr= new int[a.length+b.length];
    int i=0,j=0,k=0;
    
    while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            arr[k]=a[i];
            i++;
            k++;
        }else{
            arr[k]=b[j];
            j++;
            k++;
        }   
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }

    for(int ele : arr){
        System.out.print(ele+" ");
    }
}
}
