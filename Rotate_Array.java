public class Rotate_Array {
    public static void main(String[] args) {
        int arr[]={6,8,1,2,4,9,0};
        int d=3;
        d=d%arr.length; //Important
        int start=0;
        int end=d-1;
        int temp=0;

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        int i=d;
        int j=arr.length-1;
        int temp1=0;

        while(i<j){
            temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
            i++;
            j--;
        }

        int a=0;
        int b=arr.length-1;
        int temp2=0;

        while(a<b){
            temp2=arr[a];
            arr[a]=arr[b];
            arr[b]=temp2;
            a++;
            b--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
