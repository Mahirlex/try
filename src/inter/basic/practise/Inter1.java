package inter.basic.practise;

public interface  Inter1 {
	
	public abstract void sum();
	void call();
	void print();
	void close();
	public static final int a=1;
	String name="hyd";
	
	
}
 abstract class Inter0 implements Inter1{
	 
	@Override
	public void sum() {
		System.out.println("hello");
		
	}

	@Override
	public void call() {
		System.out.println("this is call method");
		
	}

	@Override
	public abstract void print(); 
		// TODO Auto-generated method stub
		
	

	@Override
	public abstract void close(); 
		// TODO Auto-generated method stub
		
 }
	
 
