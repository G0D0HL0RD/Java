public class DiscreteDistribution {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = args.length - 1;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(args[i + 1]);
		}

		int[] s = new int[n];
		s[0] = 0;
		for (int j = 1; j < n; j++) {
			s[j] = arr[j] + s[j - 1];

		}

		for (int i = 0; i < m; i++) {
			int r = (int) (Math.random() * s[n - 1] + 1);
			for (int j = 2; j <= n; j++) {
				if (r >= s[(j - 2)] && r < s[j - 1])
					System.out.print(j + " ");
			}
		}
	}
}
