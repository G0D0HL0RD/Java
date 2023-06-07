import java.util.*;
public class ConnectNRopes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[]= new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        ConnectNRopes obj = new ConnectNRopes();
        System.out.println(obj.minCost(arr));
    }
    public int minCost(int a[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            pq.add(a[i]);
        }
        int ans=0;
        while(pq.size()>1){
            int p = pq.poll();
            int q = pq.poll();
            int sum = p +q;
            ans+=sum;
            pq.add(sum);
        }
        return ans;
    }
}
