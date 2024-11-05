package pra.imp.cla;
import  com.java.classes.Sample;

public class Mod {
	public static void main(String args[]) {
		Mod m=new Mod();
	m.call();
	Sample r=new Sample();
	r.display();
	User p=new User();
	p.multiply(10, 20);
	
	}
	private void call() {
		System.out.println("value is:");
	}
}
class User extends Mod{
	public int multiply(int a, int b) {
		System.out.println("multiply is:"+(a*b));
		return a*b;
	}
}
