import java.util.*;
import java.io.*;
class Conversion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose and option from the following for conversion of deciaml to:");
		System.out.print("Binary: 1\nOctal: 2\nhexadecimal: 3\n");
		System.out.println("Enter your choice: ");
		int n=sc.nextInt();
		System.out.println("Enter the decimal number: ");
		int num=sc.nextInt();
		sc.close();
		int i=0;
		int j=0;
		if(n==1){
		//decimal to binary conversion

			int binary[]= new int[64];
			while(num>0){
				binary[i]=num%2;
				num=num/2;
				i++;
			}
			System.out.print("The converted string from decimal to binary is: ");
			for(j=i-1;j>=0;j--){
				System.out.print(binary[j]+" ");
			}
		}


		if(n==2){
		//decimal to octal conversion

			int octal[]= new int[64];
			while(num>0){
				octal[i]=num%8;
				num=num/8;
				i++;
			}
			System.out.print("The converted string from decimal to octal is: ");
			for(j=i-1;j>=0;j--){
				System.out.print(octal[j]+" ");
			}
		}


		if(n==3){
		//decimal to hexdecimal conversion

			char hexadecimal[]= new char[100];
			while(num>0){
				int temp=0;
				temp=num%16;
				if(temp<10){
					hexadecimal[i]=(char)(temp + 48);
					i++;
				}
				else{
					hexadecimal[i]=(char)(temp + 55);
					i++;
				}
					num=num/16;
				}
			System.out.print("The converted string from decimal to hexadecimal is: ");
			for(j=i-1;j>=0;j--)
				System.out.print(hexadecimal[j]+" ");
		}

	}
}