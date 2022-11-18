public class TimeComplexityDemo{
	public static void main(String args[]){
		double now= System.currentTimeMillis();
		TimeComplexityDemo demo = new TimeComplexityDemo();
		System.out.println(demo.findSum(9999));

		System.out.println("Time take:" + (System.currentTimeMillis() - now) +"milliseconds");
	}
	// public int findSum(int n){
	// 	return n*(n+1)/2;
	// }

	public int findSum(int n){
		int sum=0;
		for(int i=0; i<=n;i++){
			sum+=i;
		}
		return sum;
	}
}