import java.util.*;
public class Stocks2 {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(calculatePrice(prices));
    }
    public static int calculatePrice(int arr[]){
        int maxProfit =0;
        int i =1;
        while(i<arr.length){
            if(arr[i]>arr[i-1]){
                maxProfit = maxProfit + (arr[i] - arr[i-1]);
            }
            i++;
        }
        return maxProfit;
    }
}
