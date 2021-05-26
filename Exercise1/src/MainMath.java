class BasicMath{
	public static double sum(double a, double b) {
		
		return a + b;
	}
	
	public static double sub(double a, double b) {
		return a - b;
	}
	
	public double mul(double a,double b) {
		return a * b;
	}
}

class Basic2Math {
	private double a;
	private double b;
	
	public Basic2Math(double a, double b) {
	 this.a = a;
	 this.b = b;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double sum() {
		return BasicMath.sum(a, b);
	}
	
	public double sub() {
		return BasicMath.sub(a, b);
	}
	
	BasicMath bm = new BasicMath();
	public double mul() {
		return bm.mul(a, b);
	}
	
}
public class MainMath {
	public static void main(String[] args) {
		Basic2Math b = new Basic2Math(3.0, 2.0);
		System.out.println("Sum a + b = " + b.sum());
		System.out.println("Sum a - b = " + b.sub());
		System.out.println("Sum a * b = " + b.mul());
	}
}
