public class ArrayResize {
	public static void main(String[] args) {
		ArrayResize ar = new ArrayResize();
		int[] arr = {4,5,3,2,1,0};
		ar.printArray(arr);
		arr=ar.resize(arr, 12);
		ar.printArray(arr);
}

	public int[] resize(int[] arr,int capacity){
		int[] temp= new int[capacity];
		for(int i=0;i<arr.length;i++){
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
}

	public void printArray(int[] arr){
	int n= arr.length;
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
}
