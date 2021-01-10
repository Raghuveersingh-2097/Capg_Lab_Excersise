package Mandatory;
/**
         Program to print the mirror image of input string
         along with the original string.............. 
**/
public class labExcersise3Of2 {
/**
     Method which generate the mirror image and add 
     with the original to get desired output...... 
**/
public static String getImage(String original) {
	   StringBuilder mirror =new StringBuilder(original);
	   mirror.reverse();
	   String output_String=mirror.toString();
	   return original+"|"+output_String;
}
/**
------------------------------------------MAIN METHOD---------------------------------------------------------------
**/
public static void main(String[] args) {
		// TODO Auto-generated method stub
    String input="EARTH";
    System.out.println(getImage(input));
}
}
