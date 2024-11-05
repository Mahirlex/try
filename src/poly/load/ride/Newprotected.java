package poly.load.ride;

public class Newprotected {
	
		public static void main(String[] args) {
			Protect p=new Protect();
			p.pro();
			p.pro1();
			p.pro2();
			p.pro3();	
			p.tec();
			p.tec1();
			p.tec2();
			p.tec3();
		}	
	    protected void pro() {
	    	System.out.println("hi");
	    	 }
	    protected void pro1() {
	    	System.out.println("hey");
	    }
	    protected void pro2() {
	    	System.out.println("white");
	    }
	    protected void pro3() {
	    	System.out.println("grey");
	    }
	    }

	class Protect extends Newprotected{
		public void tec() {
			System.out.println("hello");
		}
		protected void tec1() {
			System.out.println("happy");
		}
		void tec2() {
			System.out.println("black");
	}
		private void tec3() {
			System.out.println("green");
		}
	}


