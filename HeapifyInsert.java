import java.util.*;
public class HeapifyInsert {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        arr[0]= 50;
        arr[1]= 30;
        arr[2]= 40;
        arr[3]= 5;
        arr[4]= 10;
        arr[5]= 20;
        int n = 6;
        int elm = 60;
        HeapifyInsert heap = new HeapifyInsert();
        int res[]=heap.insert(arr,n,elm);

        System.out.println(Arrays.toString(res));
    }
    public int[] insert(int arr[],int n, int k){
        n=n+1;
        arr[n-1] = k;
        int i = n-1;
        HeapifyInsert heap = new HeapifyInsert();
        return heap.heapify(arr,n,i);
    }
    public int [] heapify(int arr[], int n,int i){
        int parent = (i-1)/2;
        if(arr[i]>arr[parent]){
            int temp = arr[i];
            arr[i] = arr[parent];
            arr[parent] = temp;

            heapify(arr,n,parent);
        }
        return arr;
    }
}
