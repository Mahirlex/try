package poly.load.ride;

public class Task {
	public static void main(String[] args) {
		Task q= new Task();
		q.display();
		Task r=new Task1();
		r.display();
		Task w=new Task2();
		w.display();
		Task t=new Task3();
		t.display();
	}
	
	public void display() {
		System.out.println("hoi");
	}
}
class Task1 extends Task{
	public void display() {
		System.out.println("this is Task1");
		
	}
}
class Task2 extends Task{
	public void display() {
		System.out.println("task2");
	}
}
class Task3 extends Task{
	public void display() {
		System.out.println("task3");
	}
}