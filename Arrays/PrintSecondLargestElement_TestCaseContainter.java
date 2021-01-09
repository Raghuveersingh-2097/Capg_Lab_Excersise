package com.capg.td_demo;

import java.util.Arrays;

public class PrintSecondLargestElement_TestCaseContainter {
/**--------------------------------------------If Array is empty-------------------------------------------**/
	
public static int isEmpty(int array_length) {
		return 0;
}
/**---------------------------------------------If Only Single Elements Is There-----------------------------------------**/

public static int ifSingleElementIsThere(int array_value) {
		return array_value;
}
/**--------------------------------------------If more than one elements is there in array---------------------------------**/
public static int getSecondSmallest(int input[]) {
		Arrays.sort(input);
		int val_cotnainer;
	if(input.length==0)
	{
		val_cotnainer=isEmpty(input.length);
}
	else
		
		if(input.length==1) 
		{
			val_cotnainer=ifSingleElementIsThere(input[0]);
}
	else
		
	    if(input.length==2)
	    {
	    	val_cotnainer=Math.min(input[0], input[1]);
}
	else
	{
		val_cotnainer=input[input.length-2];
}
	return val_cotnainer;
}
}
