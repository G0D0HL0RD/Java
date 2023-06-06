import java.util.*;
public class HeapifyDelete {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        arr[0]= 50;
        arr[1]= 30;
        arr[2]= 40;
        arr[3]= 5;
        arr[4]= 10;
        arr[5]= 20;
        int n = 6;
        HeapifyDelete heap = new HeapifyDelete();
        int res[]=heap.delete(arr,n);

        System.out.println(Arrays.toString(res));
    }
    public int[] delete(int a[], int n){
        a[0] = a[n-1];
        n=n-1;

        return heapify(a,n,0);

    }
    public int[] heapify(int a[],int n, int i){
        int largest = i;
        int leftChild =  (2*i)+1;
        int rightChild = (2*i)+2;

        if(leftChild<n && a[leftChild]>a[largest]){
            largest = leftChild;
        }
        if(rightChild<n && a[rightChild]>a[largest]){
            largest = rightChild;
        }

        if(largest!=i){
            int temp = a[largest];
            a[largest]=a[i];
            a[i] = temp;

            heapify(a,n,largest);
        }
        return a;
    }
}
