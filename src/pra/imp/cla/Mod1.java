package pra.imp.cla;

public class Mod1 {
	public static void main(String[] args) {
		Mod1 z=new Mod1();
		z.add(1,2);
		Mod2 x=new Mod2();
		x.subract(1, 8);
		Mod4 j=new Mod4();
		j.pose(1.33, 2.90);
	}
	private int add(int a, int b) {
		System.out.println("addition is:"+(a+b));
		return a+b;
	} 
}
class Mod2 extends Mod1{
	protected int subract(int a, int b) {
		System.out.println("subraction is:"+(a-b));
		return a-b;
	}
}
 class Mod3 extends Mod2 { {
	for (int q=10; q>=9; ++q) {
		System.out.println("value is:"+(q));
	}
} }
 class Mod4 extends Mod2{
	 public double pose(double a, double b) {
		 System.out.println("double is:"+(a+b));
		 return a+b;
	 }
 }