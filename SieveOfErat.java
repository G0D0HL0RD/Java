import java.util.Arrays;
import java.util.Scanner;
public class SieveOfErat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[]=sieveOfEratoSthenes(n);

        for (int i = 0; i <=n; i++) {
            
            System.out.println(i+" "+ arr[i]);
        }

    }
        static boolean[] sieveOfEratoSthenes(int n){
            
            boolean arr[]=new boolean[n+1];

            Arrays.fill(arr, true);
            arr[0]=arr[1]=false;
            for(int i = 2;i*i<=n;i++){
                for(int j=2*i;j<n;j+=i){
                    arr[j]=false;
                }
            }
            return arr;
        }

}
