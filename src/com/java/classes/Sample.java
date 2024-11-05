package com.java.classes;
 public class Sample{
	public static void main(String args[]) {
		
			Samples s=new Samples();
			s.copy();
			s.display();
		
	}
	public void display() {
		System.out.println("this is public");
	}
}
class Samples extends Sample{
	protected void copy() {
		System.out.println("this is protected");
	}
}
