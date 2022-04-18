import java.util.Scanner;
class PatTwo{
	public static void main(String[] args){
		System.out.print("Enter the lenght of the pattern: ");
		Scanner PAT=new Scanner(System.in);
		int n= PAT.nextInt();
		int i,j,s;
		for(i=1;i<=n;i++)
		{
		    for(s=n;s>i;s--)
		    {
			System.out.print(" ");
		    }
		    for(j=1;j<=i;j++)
		    {
			System.out.print("* ");
		    }
		    System.out.println("");
		} 
	    for(i=n-1;i>=1;i--)
		{
		    for(s=n;s>i;s--)
		    {
			System.out.print(" ");
		    }
		    for(j=1;j<=i;j++)
		    {
			System.out.print("* ");
		    }
		    System.out.println("");
		}

	}
}

