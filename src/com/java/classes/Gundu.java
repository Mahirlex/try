package com.java.classes;

public class Gundu{
	public static void main (String args[]) {
		G2 G=new G2();
		G.display();
		G.print();
		G3 s=new G3();
		s.copy();
		s.display();
		G4 t=new G4();
		t.say();
		t.print();
		
	}
	void display() {
		System.out.println("employe salary");
	}
}
 class G2 extends Gundu{
	void print() {
		System.out.println("200");
	}
}
 class G3 extends Gundu{
	 void copy() {
		 System.out.println("next is multi");
	 }
 }
 class G4 extends G2{
	 void say() {
		 System.out.println("multi level");
	 }
 }
 