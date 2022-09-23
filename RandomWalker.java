public class RandomWalker {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int x = 0;
		int y = 0;
		System.out.println("(0, 0)");
		int steps = 0;
		while(Math.abs(x)+Math.abs(y)<r){
			double chance= Math.random();
			if(chance<=0.25){
				x++;
			}
			else if(chance<=0.5 && chance>0.25){
				x--;
			}
			else if(chance<=0.75 && chance>0.5){
				y++;
			}
			else if(chance>0.75){
				y--;
			}
			steps++;
			System.out.println("(" + x + ", " + y + ")");
		}
		System.out.println("steps= " + steps);
	}
}
