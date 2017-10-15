package pig4;			//creation of package 

import java.util.*;		//importing the java.util to access the Scanner class

public class OddEven {		//main class of the program

	public static void main(String[] args) {		//main method of the program
		
		int start, end, loop;				//declaration of variables
		
		Scanner sc = new Scanner(System.in);   // creation of object of scanner class
		
		System.out.println("Enter the start of range: ");    //printing statement on console
		start = sc.nextInt();								//storing the input from the user to a variable
		System.out.println("Enter the end of range: ");    //printing statement on console
		end = sc.nextInt();								//storing the input from the user to a variable
		System.out.println("Even numbers between "+start+ " and "+end+" are: ");   //printing statement on console
		for(loop = start; loop < end; loop++)    //for loop
		{
			if(loop % 2 == 0) {				//condition to check even numbers
				System.out.println(loop);	//printing even values on console
			}
		}
		System.out.println("Odd numbers between "+start+ " and "+end+" are: ");   //printing statement on console
		for(loop = start; loop < end; loop++)    //for loop
		{
			if(loop % 2 != 0) {				//condition to check odd numbers
				System.out.println(loop);	//printing odd values on console
			}
		}
		sc.close();   //closing the scanner method
	}

}
