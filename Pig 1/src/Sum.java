
class Acad {        //class acad created 
	
	public void main(int num1, int num2) {      //method main created and passed two values to it
		int sum = num1 + num2;					//declaration of variable sum to integer and performing addition 
		System.out.println("The sum is: " +sum);     //printing the sum of two numbers
	}
}
public class Sum {			//main class of the program
	
	public static void main(String[] args) {      //main method of the program
		int num1 = 10, num2 = 20;		//declaration of variables and assigning the values to it
		Acad a = new Acad();				//creating object of class acad
		a.main(num1, num2);				//calling the method main using the object of acad
	}
}

