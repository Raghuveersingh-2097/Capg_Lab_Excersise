package Mandatory;
/**
 Checks if the entered number is a power of two or not**/
public class LabExcersise1Of8 {

	public static boolean checkNumber(int n) {
		boolean flag=true;
		   int i=0;
		   while(n>1) {
			   if(n%2==0) {
				   i++;
			   }
			   else {
				   flag=false;
				   break;
			   }
			   n=n/2;
			   
		   }
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int test=10;
   if(checkNumber(test)==false) {
	   System.out.println(test+" is not a power of two.....");
   }
   else {
	   System.out.println(test+" is a power of two....");
   }
	}

}
