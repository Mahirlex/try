package com.java.classes;
import pra.imp.cla.*;
 class Parent {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.P3();
		P4 q=new P4();
		q.display1();
		
	}
	protected void P3() {
		System.out.println("this is protected");		
	}
}
class P4{
	protected void display1() {
		System.out.println("this ");
	}
}


