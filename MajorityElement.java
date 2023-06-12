import java.util.*;
class MajorityElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("enter the element in the array");
        int arr[] = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        int  ansIndex=0;
        int count = 1;

        for(int i=1;i<n;i++){
            if(arr[i]==arr[ansIndex])
                count++;
            else
                count--;
            if(count==0){
                ansIndex=i;
                count=1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==arr[ansIndex]){
                count++;
                if(count>(n/2)){
                    break;
                }
            }
        }
        System.out.println("The majority element in the array is: "+ arr[ansIndex]);

        }
    }