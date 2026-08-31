public class Array_with_all_palindrome {
    public static void main(String[] args) {
        int[] arr={111,222,333,444,555};
        for(int i=0; i<arr.length; i++){

            int num=arr[i];
            int temp =num;
            int rev=0;
            
            while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
            }
            if(num==rev)
                System.out.println("Palindrome");
            else
                System.out.println("Not-Palindrome");
        }
    }
}
