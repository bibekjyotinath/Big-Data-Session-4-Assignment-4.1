package pig2;      //package created named pig2

import java.util.*;		//importing the java.util for accessing the scanner method 

class Acad {				//creation of class acad
		
	public void main(int num1, int num2) {	//creation of method named main and passing two values to it 
		int sum = num1 + num2;				//declaration of variables sum and adding the num and storing it in 
		System.out.println("The sum is: " +sum);		//printing the output on console
	}
}

public class Sum {			//creation of main class Sum
	public static void main(String[] args) {		//main method of the program
		
		int num1, num2;		//declaration of variables 
		Acad a = new Acad();			//creation of object of class acad
		Scanner sc = new Scanner(System.in);		//creation of object of scanner class
		
		System.out.println("Enter 1st number: ");	//printing the statement on console
		num1 = sc.nextInt();							//taking input from user and storingit in variable
		System.out.println("Enter 2nd number: ");	//printing the statement on console
		num2 = sc.nextInt();							//taking input from user and storingit in variable
		
		a.main(num1, num2);					//calling of the main method using the object of class acad
		
		sc.close();				//closing the scanner class
	}

}
