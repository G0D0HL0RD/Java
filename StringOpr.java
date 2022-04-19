import java.util.*;

public class StringOpr{
	int wordCount(String S){
		int count=1;
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)==' ')
			count++;
		}
		return count;
	}

	String arrayToString(char arr[]){
		char ch='\u0000';
		String str="";
		for(int j=0;j<arr.length-1;j++){
			ch=arr[j];
			str=str+ch;
		}
		return str;
	}
	char mostFrequent(String string){
		int maxfrq=0;
		char c='\u0000';
		for(int k=0;k<string.length();k++){
		int count=0;
		for(int j=0;j<string.length();j++)
			if(string.charAt(k)==string.charAt(j))
			count++;
			if(maxfrq<count){
				maxfrq=count;
				c=string.charAt(k);
			}
	}
	return c;
	}



	public static void main(String[] args){
		StringOpr obj = new StringOpr();
		System.out.println("The Word count of" + "Welcome to Java Programming course" +"is:" + obj.wordCount("Welcome to Java Programming course"));

		char arr[]={'q','w','e','r','t','y'};
		System.out.println("Array to String Conversion: "+obj.arrayToString(arr));

		System.out.println("The Most frequent character in the string " + "misisspi " + "is:" + obj.mostFrequent("MISISSIPI"));
	}
}