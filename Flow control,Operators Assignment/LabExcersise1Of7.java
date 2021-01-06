package Mandatory;
/**
 Program to check whether a number is an increasing number or 
 not
 **/
public class LabExcersise1Of7 {

	public static boolean checkNumber(int input)
	{
	    // Deal with negative inputs...
	    if (input < 0)
	        input = -input;
	    int max_digit = 10; // always greater than any digit
	    int current_digit;
	    while (input > 0) {
	        current_digit = input % 10;
	        if (max_digit < current_digit)
	            return false;
	        max_digit = current_digit;
	        input /= 10;
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=134468;
		if(checkNumber(input)==true) {
			System.out.println("Numbers is Increasing in nature.......");
		}else
		{
			System.out.println("Number is Randomly placed.......");
		}

	}

}
