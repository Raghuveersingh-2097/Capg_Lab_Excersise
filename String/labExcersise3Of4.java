package Mandatory;
/**
            Program to modify the number such that new number would be
            the difference between two consecutive numbers........... 
**/
public class labExcersise3Of4 {
/**
            Accept the number and modify it as per the requirement.....
**/
public static int modifyNumber(int input1) {
		String result_storage="";
		String str_input=Integer.toString(input1);
		for(int i=0;i<str_input.length()-1;i++) {
			result_storage+=Math.abs(((int)str_input.charAt(i)-(int)str_input.charAt(i+1)));	
}
		result_storage+=str_input.charAt(str_input.length()-1);
		int result=Integer.parseInt(result_storage);
		return result;
}
/**--------------------------------------------MAIN METHOD------------------------------------------------------**/
public static void main(String[] args) {
		int input=12345;
		System.out.print(modifyNumber(input));
}
}
