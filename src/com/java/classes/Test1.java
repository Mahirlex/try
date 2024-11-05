package com.java.classes;
 class Parent1{
	void dispaly()
	{
		System.out.println("pARENT METHOD");
	}
}
public class Test1 extends Parent1{
	public static void main(String[] args)
	{
		
		Test1 s=new Test1();
		s.dispaly();
	}

}
