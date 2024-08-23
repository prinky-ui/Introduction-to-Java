package introduction;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter any number");
	Scanner sc = new Scanner (System.in);{
		int number = sc.nextInt();
		System.out.println("num:"+number%1+"num2"+number%number);
		 if (number%1 == number && number%number ==1 ) {
			 System.out.println(number +"is a prime number");
			 
		 }
			
		}

	}

}
