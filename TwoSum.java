import java.util.*;
class TwoSum{
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(getTwoSum(arr, target)));
    }
    public static int[] getTwoSum(int a[],int k){
        int res[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<a.length;i++){
            map.put(a[i],i);
        }
        for(int i =0;i<a.length;i++){
            if(map.containsKey(k-a[i]) && map.get(k-a[i])!=i){
                res[0] = i;
                res[1] = map.get(k-a[i]);
            }
        }
        return res;
    }
}