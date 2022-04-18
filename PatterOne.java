import java.util.Scanner;
import java.lang.*;
class PatterOne{
	public static void main(String[] args){
		Scanner PAT= new Scanner(System.in);
		System.out.print("Enter the number for the pattern length: ");
		int n=PAT.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}