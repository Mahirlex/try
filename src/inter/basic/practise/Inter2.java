package inter.basic.practise;

public interface Inter2 {
	void print();
	void draw();
	public static final int a=2;
	String name="mahi";
}
class Inter3 implements Inter2{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print this");
		System.out.println(Inter2.a);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw");
		System.out.println(Inter2.name);
	}
	
}
 class  Int4{
	 public static void main (String[] args) {
			Inter2 d=new Inter3();
			d.print();
			d.draw();
			System.out.println(Inter2.a + Inter2.name);
	 }
}