package pig3;			//creation of package

import java.util.*;		//importing  the java.util to access Scanner class

public class Sum {		//Main class of the program

	public static int add(int num1, int num2) {    //method add and passing two variables to it 
			
		int sum = num1 + num2;	//declaration of variable and performing addition
		return sum;				//returning the value 
	}
	public static void main(String[] args) {   //main method of the program
		
		int num1, num2;			//declaration of variables
			
		Scanner sc = new Scanner(System.in); 	//creating the object of scanner method
		
		System.out.println("Enter 1st Number: ");    //printing the statement on console
		num1 = sc.nextInt();							//storing the value from the user
		System.out.println("Enter 2nd Number: ");	//printing the statement on console
		num2 = sc.nextInt();							//storing the value from the user
		System.out.println("The 1st number is: " +num1);      //displaying the value of 1st number on console
		System.out.println("The 2nd number is: " +num1);      //displaying the value of 2nd number on console
		System.out.println("The Sum of "+num1+ " and " +num2+ " is: " +add(num1, num2));					//calling method to perform addition and display output on console
		
		sc.close();    //closing the scanner method
	}

}
