package MathProgram;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[]args) {
		 //10,20,30
		//result 
		Scanner m = new Scanner(System.in);
		
		System.out.println("Enter the valu of X: ");
		
		double x = m.nextDouble();
		
		System.out.println("Enetr the value of  Y: ");
		
		double y = m.nextDouble();
		
		System.out.println("Enetr th value of z: ");
		
		double z =m.nextDouble();
		
		double result =0;
		
		result = Math.cbrt(Math.pow(x, 2)+Math.pow(y, 2)-Math.abs(z));
		
		System.out.println(result);
		 m.close();
	}
	
	
	

}
