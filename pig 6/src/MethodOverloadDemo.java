
class Add {		//creation on class Add to perform method overloading
	public int sum (int num1, int num2) {		//creation of sum method and passing two variables of integer type
		int sum = num1 + num2;	//declaration of variable and performing addition
		return sum;				//returning the value of sum
	}
	public int sum (int num1, int num2, int num3) {     //creation of sum method and passing three variables of integer type
		int sum = num1 + num2 + num3;			//declaration of variable and performing addition
		return sum;								//returning the value of sum
	}
	public double sum(double num1, double num2) {  //creation of sum method and passing two variables of double type
		double sum = num1  + num2;		//declaration of variable and performing addition
		return sum;						//returning the value of sum	
	}
}
public class MethodOverloadDemo {		//main class of the program

	public static void main(String[] args) {		//main method of the program
		
		double num4 = 12.5, num5 = 24.5;    //declaration of variables
		int num1 = 12, num2 = 24, num3 = 36;    //declaration of variables
		
		Add a =  new Add();			//creation of obejct of class Add
		
		System.out.println("The sum is: "+a.sum(num1, num2));   //calling of method and displaying the output on console
		System.out.println("The sum is: "+a.sum(num1, num2, num3));   //calling of method and displaying the output on console
		System.out.println("The sum is: "+a.sum(num4, num5));   //calling of method and displaying the output on console
		
	}

}
