package Rabish;
import java.util.Scanner;
public class CircleArea {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the circle:");
		 int r=sc.nextInt();
		System.out.println("Area of the circle is:"+ area(r));
		System.out.println("Circumference of the circle is:"+ circumfrence(r));
		
	}
	public static double area(int r) {
	
		return Math.PI*r*r;
	}
	public static double circumfrence(int r) {
	
		return Math.PI*2*r;
	}

}
