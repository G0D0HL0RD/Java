import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
class SlidingWindowUsingHeap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int arr[] = {4,1,3,5,1,2,3,2,1,1,5};
        ArrayList<Integer> l1 = new ArrayList<>();
        int k = sc.nextInt();
        sc.close();
        for(int i =0;i<k;i++){
            pq.add(arr[i]);
        }
        l1.add(pq.peek());
        pq.remove(arr[0]);

        for(int i =k;i<arr.length;i++){
            pq.add(arr[i]);
            l1.add(pq.peek());
            pq.remove(arr[i-k+1]);
        }
        System.out.println(l1);
    }
}