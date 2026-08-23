//Merge two sorted array in a single big array
public class Merge_2_Sort_Array {
    public static void main(String[] args) {
        
    int [] a={2,4,6,8};
    int [] b={1,3,5,7,9};
    int len=a.length+b.length;
    int [] c=new int[len];
    int i=0,j=0,k=0;

    for(int m=0; m<len; m++){
         if(a[m]>b[m]){
          c[m]=b[m];
          
         }
    }
    
}
}
