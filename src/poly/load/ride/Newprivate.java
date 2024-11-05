package poly.load.ride;

public class Newprivate {
	
		public static void main(String[] args) {
			Newprivate w=new Private1();
			w.name();
			w.names();
			w.names1();
			w.names3();
			w.name1();
			w.name2();
			w.name3();
			
		}	
	    private void name() {
	    	System.out.println("hi");
	    	 }
	    private void name1() {
	    	System.out.println("hey");
	    }
	    private void name2() {
	    	System.out.println("white");
	    }
	    private void name3() {
	    	System.out.println("grey");
	    }
	    }

	class Private1 extends Newprivate{
		public void names() {
			System.out.println("hello");
		}
		protected void names1() {
			System.out.println("happy");
		}
		void names2() {
			System.out.println("black");
	}
		private names3() {
			System.out.println("green");
		}
	}


