package introduction;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in) ;{
	}
	
	System.out.println("Enter first number");
	int num1 = sc.nextInt();
	
	System.out.println("Enter second number");
	int num2 = sc.nextInt();
	
	System.out.println("Original value");
	System.out.println("num1 = " + num1 );
	System.out.println("num2 = " + num2 );
	int num3=num1;
	num1=num2;
	num2=num3;
	

    System.out.println("Swapped Values");	
    System.out.println("num1 = " + num1 );
    System.out.println("num2 = " + num2 );}
	
	}


    
    
    		

