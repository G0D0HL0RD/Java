public class FloatValues implements Calc {

	float x, y;
	FloatValues(float p, float q) {
	    x = p;
	    y = q;
	}
	public void add() {
	    System.out.println(x+y);
	}
	public void sub() {
	    System.out.println(x-y);
	}
	public void multiply() {
	    System.out.println(x*y);
	}
	public void divide() {
	    System.out.println(x/y);
	
	}
	public static void main(String[] args) {
		FloatValues obj = new FloatValues(7.5f, 6.3f);
		System.out.print("Addition= ");
		obj.add();
		System.out.print("Subtraction= ");
		obj.sub();
		System.out.print("Multiplication= ");
		obj.multiply();
		System.out.print("Division= ");
		obj.divide();
	    }
	}