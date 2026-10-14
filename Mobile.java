package com.myjavaproject;

public class Mobile {
	 String brand;
	 int price ;
	 String color;
	 Mobile(){
		 this.brand = "unknown";
		 this.price = 0;
		 this.color = "unknown";
		 System.out.println("no args constructor");
	 }
	 Mobile(String brand,int price){
		 this.brand = brand;
		 this.price = price;
		 System.out.println("two args constructor");
	 }
	 Mobile(String brand,int price,String color){
		// super(String brand, int price);
		 this.brand = brand;
         this.price = price;
		this.color = color;
		 System.out.println("three args constructor");
	 }
	  void display() {
		 System.out.println("brand name:" + brand);
		 System.out.println("price : "+ price);
		 System.out.println("color:" + color);
	  }
	  public static void main(String[] args) {
			 Mobile m1 = new Mobile();
			 Mobile m2 = new Mobile("pavani",1000);
			 Mobile m3 = new Mobile("pavani",1000,"black");
	         m1.display();
			 m2.display();
			 m3.display();
			 }
}
	
