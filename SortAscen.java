import java.util.Scanner;
class SortAscen{
	public static void main(String[] args){
		Scanner Num=new Scanner(System.in);
		System.out.print("enter the total no. of numbers you want to sort: ");
		int n=Num.nextInt();
		int Arr[]= new int[n];
		int i;
		System.out.println("enter the numbers you want to sort: ");
		for( i=0;i<n;i++){
			Arr[i]=Num.nextInt();
		}

		int temp=0;

		for(i=0;i<Arr.length;i++){
			for(int j=i+1;j<Arr.length;j++){
				if(Arr[i]>Arr[j]){
					temp=Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=temp;

				}
			}
		}
		System.out.println();

		System.out.print("The sorted order of numbers is : ");
		for(i=0;i<Arr.length;i++){
			System.out.print(Arr[i]+" ");
		}

	}
}