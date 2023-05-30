import java.util.*;
public class MissingElementInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the range: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter few numbers in you want to create range with");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Specify the Highest and Lowest element in the range: ");
        System.out.println("Low: ");
        int low = sc.nextInt();
        System.out.println("High: ");
        int high = sc.nextInt();
        sc.close();

        Set<Integer> set = new HashSet<>();

        for(int i =0;i<n;i++){
            set.add(arr[i]);
        }
        System.out.println("The missing element in the above range are: ");
        for(int i=low;i<=high;i++){
            if(!(set.contains(i))){
                System.out.println(i);
            }
        }
    }
}