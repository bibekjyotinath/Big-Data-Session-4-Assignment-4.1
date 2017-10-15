package pig8;		//creation of package

public class SortDemo {			//main class of the program

	public static void main(String[] args) {		//main method of the  program
		
		int arr[] = {2, 30, 21, 3, 55, 1, 10, 24};   //decalration of array and passing values into array
		int i, j, temp;      //declaration of variable
		
		for (i = 0; i < 8; i++)       //for loop 
        {
            for (j = i + 1; j < 8; j++) 
            {
                if (arr[i] < arr[j])    //checks if value is 1st value is smaller than second
                {
                	/*interchange the places*/
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Decending Order:");   //displaying the message on console
        for (i = 0; i < 8; i++) 
        {
            System.out.print(arr[i] + ",");		//displaying the value on console
        }


	}

}
