package poly.load.ride;

public class Find {
       public static void main(String[] args) {
    	  Find1 f=new Find2();
    	  f.mec();
    	   
       }}
   class Find1 {
    		protected void mec() {
    			System.out.println("find1 method");

    		}
    	}

  class Find2 extends Find1 {

    	 void mmec() {
    			System.out.println("find 2 subclass");
    		}
    	}

