package Mandatory;
/**
         Program to accept the string and replace all the constants in the string
         with the next alphabet
**/
public class labExcersise3Of3 {
/**
         Method which perform the above operation
**/
public static String alterString(String input) {
     String output="";
	 for(int i=0;i<input.length();i++) { 
	 if(input.charAt(i)=='A'||input.charAt(i)=='a'||input.charAt(i)=='E'||input.charAt(i)=='e'||input.charAt(i)=='I'||input.charAt(i)=='i'||input.charAt(i)=='O'||input.charAt(i)=='o'||input.charAt(i)=='U'||input.charAt(i)=='u'){
		 output+=input.charAt(i);		 
}
	 else {
		 int ascii_val=(int)input.charAt(i);
		 ascii_val+=1;
		 output+=(char)ascii_val;  		 
}
}
	 return output;
}
/**
-------------------------------------------------MAIN METHOD--------------------------------------------------------
**/
public static void main(String[] args) {
		// TODO Auto-generated method stub
   String input="JAVA";
   System.out.println(alterString(input));
}
}