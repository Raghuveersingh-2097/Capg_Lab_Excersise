package Mandatory;

import java.util.Arrays;

/**
 Print the second largest element from the array
**/
public class labExcersise2Of1 {
public static int getSecondSmallest(int input[]) {
	  Arrays.sort(input);
	  return input[input.length-2];
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
       int input_array[]= {2,5,3,1,7,9,6,8};
       System.out.println("Second Largest element in array is "+getSecondSmallest(input_array));
}

}
