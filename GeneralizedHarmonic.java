public class GeneralizedHarmonic {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);

		Double harmean = 0.0;
		for (int i = 1; i <= n; i++) {
			harmean = harmean + 1 / (Math.pow((double) i, (double) r));
		}
		System.out.println(harmean);
	}
}