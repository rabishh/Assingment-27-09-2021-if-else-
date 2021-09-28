package Rabish;
import java.util.Scanner;
public class Addition {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number:");
		int a= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter the operator:+ or *");
		char c=sc.next().charAt(0);
		if(c =='+') {
			
			System.out.println("you have entered for sum and your result is:"+ add(a,b) );
		}else {
			System.out.println("you have entered for sum and your result is:"+ mul(a,b) );
		}
		
		
	}
	public static int add(int a, int b) {
		
		 return a+b;
		
	}
	public static int mul(int a, int b) {
		
		return a*b;
		
	}

}
