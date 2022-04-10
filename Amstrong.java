import java.util.Scanner;
import java.lang.*;
class Amstrong{
	public static void main(String[] args){
		int n,num,sum=0;
		int r,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the number:"+" ");
		k = sc.nextInt();
		System.out.println("Enter the number:"+" " );
		n = sc.nextInt();
		num=n;
		int P;
		while (num>0){
			r=num%10;

			P=(int)Math.pow(r,k);
			sum=sum+P;
			num=num/10;
		
		}
		if(sum==n){
			System.out.println("The given number is Amstrong number.");
		}
		else{
			System.out.println("Not amstrong number.");
		}
	}
}