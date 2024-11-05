package com.java.classes;

 public class Car{
	private void team() {
		 System.out.println("private method");
	 }
	 public static void main(String[] args) {
		 Bike b=new Bike();
		 b.team1();
		 Car v=new Car();
		 v.team();
	 }
 }
 class Bike{
	public void team1() {
		System.out.println("privaten1 method");
	}
}