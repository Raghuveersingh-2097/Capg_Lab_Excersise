package Mandatory;
/**
 Program to calculate the difference of squares of first n natural numbers
 and the square of their sum...... 
**/
public class LabExcersise1Of6 {
public static int calculateDifference(int n) {
	int square_sum=0;
	int square_of_sum=0;
	int difference=0;
	for(int i=1;i<=n;i++) {
		square_sum+=(i*i);
	}
	square_of_sum=(square_sum*square_sum);
	difference=square_of_sum-square_sum;
	 return difference;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5;
       System.out.println(calculateDifference(input));
	}

}
