public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int n=arr.length;
        int maxsum=0;
        for(int st=0; st<n; st++){
            int cursum=0;
            for(int end=0; end<n; end++){
                cursum=cursum+arr[end];
                maxsum=Math.max(cursum, maxsum);
            }
        }
        System.out.println(maxsum);
    }
}
