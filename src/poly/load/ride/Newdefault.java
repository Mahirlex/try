package poly.load.ride;

public class Newdefault {

	void def() {
		System.out.println("hi");
	}

	void def1() {
		System.out.println("hey");
	}

	void def2() {
		System.out.println("white");
	}

	void def3() {
		System.out.println("grey");
	}
}

class Default1 extends Newdefault {
	public static void main(String[] args) {
		Newdefault t = new Default1();
		t.def();
		t.def3();
		t.def1();
		t.def2();
		Default1 u = new Default1();
		u.deff();
		u.deff1();
		u.deff2();
		u.deff3();

	}

	public void deff() {
		System.out.println("hello");
	}

	protected void deff1() {
		System.out.println("happy");
	}

	void deff2() {
		System.out.println("black");
	}

	private void deff3() {
		System.out.println("green");
	}
}
