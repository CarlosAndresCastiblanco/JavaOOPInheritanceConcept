/**
 * 
 */
package co.com.java;

import java.util.*;
/**
 * @author carlos.castiblanco
 *
 */


//Java program to demonstrate that Both Super Class
//and Subclass Constructors Refer to Same Object

//Importing required classes
public class MainJavaOOPInheritanceConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating an instance of above class
		// inside main() method
		Apple myApple = new Apple();
	}

}

//Class 1
//Super Class
class Fruit {

	// Method inside super class
	public Fruit() {

		// Print statement
		System.out.println("Super class constructor");

		// Displaying object hashcode of super class
		System.out.println("Super class object hashcode :" +
						this.hashCode());

		System.out.println(this.getClass().getName());
	}
}

//Class 2
//Sub class extending above super class
class Apple extends Fruit {

	// Method inside sub class
	public Apple() {

		// Print statement
		System.out.println("Subclass constructor invoked");

		// Displaying object hashcode of sub class
		System.out.println("Sub class object hashcode :" +
						this.hashCode());

		System.out.println(this.hashCode() + " " +
						super.hashCode());

		System.out.println(this.getClass().getName() + " " +
						super.getClass().getName());
	}
}

//Java program to illustrate the
//concept of inheritance

//base class
class Bicycle {
	// the Bicycle class has two fields
	public int gear;
	public int speed;

	// the Bicycle class has one constructor
	public Bicycle(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}

	// the Bicycle class has three methods
	public void applyBrake(int decrement)
	{
		speed -= decrement;
	}

	public void speedUp(int increment)
	{
		speed += increment;
	}

	// toString() method to print info of Bicycle
	public String toString()
	{
		return ("No of gears are " + gear + "\n"
				+ "speed of bicycle is " + speed);
	}
}

//derived class
class MountainBike extends Bicycle {

	// the MountainBike subclass adds one more field
	public int seatHeight;

	// the MountainBike subclass has one constructor
	public MountainBike(int gear, int speed,
						int startHeight)
	{
		// invoking base-class(Bicycle) constructor
		super(gear, speed);
		seatHeight = startHeight;
	}

	// the MountainBike subclass adds one more method
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}

	// overriding toString() method
	// of Bicycle to print more info
	@Override public String toString()
	{
		return (super.toString() + "\nseat height is "
				+ seatHeight);
	}
}

//driver class
class Test {
	public static void main(String args[])
	{

		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
	}
}

//Java Program to illustrate Inheritance (concise)

//Base or Super Class
class Employee {
	int salary = 60000;
}

//Inherited or Sub Class
class Engineer extends Employee {
	int benefits = 10000;
}

//Driver Class
class Gfg {
	public static void main(String args[])
	{
		Engineer E1 = new Engineer();
		System.out.println("Salary : " + E1.salary
						+ "\nBenefits : " + E1.benefits);
	}
}


//Java program to illustrate the
//concept of single inheritance

//Parent class
class one {
	public void print_geek()
	{
		System.out.println("Geeks");
	}
}

class two extends one {
	public void print_for() { System.out.println("for"); }
}

//Driver class
class Main {
	// Main function
	public static void main(String[] args)
	{
		two g = new two();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}
}


// Accessing Grandparent’s member in Java using super

//filename Main.java
// Bad Way
class Grandparent {
	public void Print()
	{
		System.out.println("Grandparent's Print()");
	}
}

class Parent extends Grandparent {
	public void Print()
	{
		System.out.println("Parent's Print()");
	}
}

class Child extends Parent {
	public void Print()
	{
		// Trying to access Grandparent's Print()
		super.super.Print();
		System.out.println("Child's Print()");
	}
}

class MainG
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.Print();
	}
}

//filename Main.java
// Good Way
class Grandparentg {
	public void Print()
	{
		System.out.println("Grandparent's Print()");
	}
}

class Parentg extends Grandparent {
	public void Print()
	{
		super.Print();
		System.out.println("Parent's Print()");
	}
}

class Childg extends Parent {
	public void Print()
	{
		super.Print();
		System.out.println("Child's Print()");
	}
}

class Maing {
	public static void main(String[] args)
	{
		Child c = new Child();
		c.Print();
	}
}