package pig5;			//creation of package

import java.util.*; 			//importing java.util to access the Scanner class
public class MulTable {		//creation of main class of the program

	public static void main(String[] args) {			//main method of the program
		
		int num1, i;
		
		Scanner sc = new Scanner(System.in);   //creating object of scanner class
		
		System.out.println("Enter a number: ");		//printing statement on console
		num1 = sc.nextInt();			//taking input from user and storing it in num1 variable
		for(i=1; i<=10;i++) {		//for loop for multiplication
			
			System.out.println(num1+ " x " +i+ " = " +(num1 * i) );   //printing the table on console
		}
		sc.close();		//closing of scanner class 	
	}

}
