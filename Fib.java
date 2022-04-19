import java.util.Scanner;
class Fib{
	public static void main(String[] args){
		System.out.print("Enter the length of fibonacci series: ");
		Scanner Num = new Scanner(System.in);
		int n = Num.nextInt();
		int x1=0,x2=1;
		int counter=0;
		while(counter<n){
			System.out.print(x1+" ");

			int x3=x1+x2;
			x1=x2;
			x2=x3;
			counter+=1;
		}

		}

	}
