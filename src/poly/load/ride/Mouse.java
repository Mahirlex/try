package poly.load.ride;

public class Mouse {
	public static void main(String[] args) {
		Mouse u=new Mouse1();
		u.disp();
		u.disp();
		u.disc();
		u.disc1();
		
	}
	protected void disp() {
		System.out.println("this is protected");
	}
	public void disp() {
		System.out.println("this is public");
	}
	
}
 class Mouse1 extends Mouse{
	private void disp() {
		System.out.println("this extend mouse");
	}
	 void disc1() {
		System.out.println("this is default");
	}
}