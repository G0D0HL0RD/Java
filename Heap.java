import java.util.Arrays;
import java.util.Scanner;

class Heap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        System.out.println("Enter any value of n < 10");
        int n = sc.nextInt();
        System.out.println("enter the values in array");
        for(int i = 0;i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(A));
        System.out.println("Enter the value you want to enter into the heap: ");
        int val = sc.nextInt();
        Heap heap = new Heap();
        int res[]=(heap.insert(A, n, val));
        System.out.println(Arrays.toString(res));
        sc.close();
    }
    public int[] insert(int a[],int n, int m){
        n = n+1;
        a[n] = m;
        int i = n;
        while(i>=1){
            int parent = i/2;
            if(a[parent]<a[i]){
                int temp = a[i];
                a[i] = a[parent];
                a[parent] = temp;
                i=parent;
            }
        }
        return a;
    }
}