package Mandatory;
import java.util.*;
public class LabExcersise1Of5 {
/** Program to Calculate the Sum of the Number**/
	public static int calculateSum(int n) {
		int sum_of_number=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum_of_number+=i;
}
}
		return sum_of_number;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println("Sum is: "+calculateSum(input));

}

}
