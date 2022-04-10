import java.util.Scanner;
class BinarySearch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int n=sc.nextInt();
		System.out.println("Enter the values in Array in ascending order: ");
		int Arr[]=new int[n];
		for(int i=0;i<n;i++){
			Arr[i]=sc.nextInt();
		}
		System.out.println("the input array is: ");
		System.out.print("{");
		for(int i=0;i<n;i++){
			System.out.print(Arr[i]+" ");
		}
		System.out.println("}");
		int high=n-1;
		int low=0;
		System.out.print("Enter the number you want to search in the: ");
		int x=sc.nextInt();
		while(low<=high){
			int mid=low+(high-low)/2;
		if(x==Arr[mid])
			System.out.printf("The number"+" %d " + "is found at index position: "+"%d",x,mid);

		if(x>Arr[mid])
			low=mid+1;

		else
			high=mid-1;

	}



	}
}