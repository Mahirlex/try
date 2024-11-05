package poly.load.ride;

public class Newpublic {
	
		public static void main(String[] args) {
			Newpublic n=new Public1();
			n.username();
			n.username1();
			n.username1();
			n.username2();
			n.user();
		}	
	    public void username() {
	    	System.out.println("hi");
	    	 }
	    public void username1() {
	    	System.out.println("hey");
	    }
	    public void username2() {
	    	System.out.println("white");
	    }
	    public void username3() {
	    	System.out.println("grey");
	    }
	    }

	class Public1 extends Newpublic {
		public void user() {
			System.out.println("hello");
		}
		protected void user1() {
			System.out.println("happy");
		}
		void user2() {
			System.out.println("black");
	}
		private void user3() {
			System.out.println("green");
		}
	}

