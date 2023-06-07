import java.util.*;
public class KminElment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[]= new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the kth minimum element you want to find: ");
        int k =  sc.nextInt();
        sc.close();
        KminElment obj  = new KminElment();
        System.out.println(obj.findMinElement(arr,k));
    }
    public int findMinElement(int a[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        while(i<k){
            pq.add(a[i]);
            i++;
        }
        for(int j = k; j<a.length;j++){
            if(pq.peek()>a[j]){
                pq.poll();
                pq.add(a[j]);
            }
        }
        return pq.peek();
    }
}
