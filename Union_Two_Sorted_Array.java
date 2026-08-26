// public class Union_Two_Sorted_Array {
//     public static void main(String[] args) {
//         int nums1[] ={3,4,6,7,9,9};
//         int nums2[]={1,5,7,8,8};
//         int nums []=new int[nums1.length+nums2.length];

//         int i=0;
//         int j=0;
//         int k=0;

//         for(; i<nums1.length && j<nums2.length; ){
//           if(nums1[i]<nums2[j]){
//             if (k == 0 || nums[k - 1] != nums1[i]){
//             nums[k]=nums1[i];
//             k++;
//             }
//             i++;
//           }else if(nums1[i]>nums2[j]){
//             if (k == 0 || nums[k - 1] != nums2[j]){
//             nums[k]=nums2[j];
//             k++;
//             }
//             j++;
//           }else{
//             if (k == 0 || nums[k - 1] != nums1[i]){
//             nums[k]= nums1[i];
//             k++;
//             }
//             i++;
//             j++;
//           }
//         }
//         while (i < nums1.length) {

//             if (k == 0 || nums[k - 1] != nums1[i]) {
//                 nums[k] = nums1[i];
//                 k++;
//             }

//             i++;
//         }

//         while (j < nums2.length) {

//             if (k == 0 || nums[k - 1] != nums2[j]) {
//                 nums[k] = nums2[j];
//                 k++;
//             }

//             j++;
//         }
//         for(int o=0; o<k; o++){
//             System.out.print(nums[o]+" ");
//         }
//     }
// }
import java.util.Arrays;
public class Union_Two_Sorted_Array {
    public static void main(String[] args) {
        int nums1[] ={3,4,6,7,9,9};
        int nums2[]={1,5,7,8,8};
        int n=nums1.length+nums2.length;
        int nums[] = new int[n];
        int k=0;

        for(int i=0; i<nums1.length; i++){
            nums[k]=nums1[i];
            k++;
        }
        for(int i=0; i<nums2.length; i++){
            nums[k]=nums2[i];
            k++;
        }
        Arrays.sort(nums);
        System.out.print(nums[0]+" ");
        for(int i=1; i<n; i++){
            if(nums[i]!=nums[i-1])
            System.out.print(nums[i]+" ");
        }

    }
}
