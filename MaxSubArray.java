public class MaxSubArray {
    public static void main(String[] args) {
        int arr[]= {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));

    }
    static int maxSubArray(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;

        for(int i=0;i<arr.length;i++){
            curSum=curSum+arr[i];
            
            if(curSum>maxSum)
            maxSum=curSum;

            if(curSum<0);
            curSum=0;
        }
        return maxSum;
    }
}
