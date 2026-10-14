package com.myjavaproject;
import java.util.Scanner;
public class TemperatureConversion {
 static Scanner sc = new Scanner(System.in);
 void celsius() {
	 System.out.println("enter celsius temp: ");
	 int t1 = sc.nextInt();
	 double f = (t1*9/5)+32;
	 System.out.println("foreign heat temperature: "+f);
 }
 void foreignheat() {
	 System.out.println("enter foreignheat temp: ");
	 double f= sc.nextInt();
	 int c = (int)(f*5/9)-32;
	 System.out.println("celsius temperature: "+c);
 }
 public static void main(String[] args) {
	 TemperatureConversion c1 = new TemperatureConversion();
	 c1.celsius();
	 c1.foreignheat();
 }
}