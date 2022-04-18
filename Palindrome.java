import java.util.*;
class Palindrome{
	public static void main(String[] args){
		System.out.println("Enter the String for Palindrome check: ");
		Scanner sc=new Scanner(System.in);
		String Str=sc.nextLine();
		String Str1="";
		sc.close();
		char ch;
		int i=0;
		int l=Str.length();
		for(i=l-1;i>=0;i--){
			ch=Str.charAt(i);
			Str1=Str1+ch;
		}
		if(Str1.equals(Str)){
			System.out.println("The given string is a palindrome");
		}
		else{
			System.out.println("The given String is not a Palindrome");
		}
	}
}
