package org.scan;

import java.util.Scanner;

public class Employee {
private static Scanner s;

public static void main(String[] args) {
	s = new Scanner(System.in);
	System.out.println("Enter the employee id");
	byte a = s.nextByte();
	System.out.println("empid="+a );
	System.out.println("enter the employee name");
	String n = s.next();
	System.out.println(" A code");
}
}
