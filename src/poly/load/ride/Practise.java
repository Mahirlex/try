package poly.load.ride;

public class Practise {
public static void main(String[] args) {
	Practise i=new Practise();
	i.print();
	Run k=new Run();
	k.service(1,4);
	System.out.println("value is:"+(1+4));
	k.service();
}
	private void print() {
		System.out.println("hello");
	}
}
 class Run extends Practise{

 public void service(int a, int b) {
		System.out.println("This is over load with para");
	}
	
	public void service() {
		System.out.println("This is loading witout any para");
	}
}