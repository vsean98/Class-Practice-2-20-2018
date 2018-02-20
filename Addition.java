package addition;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int addition=1;
		int subtraction=2;
		int multiply=3;
		int divide=4;
		System.out.println ("Please enter the order of operation ");
		Scanner scanner=new Scanner(System.in);

        int anwser=scanner.nextInt();
		
        System.out.println ("Please enter your first number ");
		Scanner scanner1=new Scanner(System.in);

        int anwser1=scanner1.nextInt();
        
        System.out.println ("Please enter your second number ");
		Scanner scanner2=new Scanner(System.in);

        int anwser2=scanner2.nextInt();
 
   
   if (anwser==addition)
   System.out.println(addNumbers(anwser1,anwser2) );
   
   else if(anwser==subtraction)
   System.out.println(subtractNumbers(anwser1,anwser2));
   
    else if (anwser==multiply)
   System.out.println(multiplyNumbers(anwser1,anwser2));
  
    else
   System.out.println(divideNumbers(anwser1,anwser2));
   
      

	}     
        
        public static int addNumbers(int anwser1,int anwser2) {
			
    		int sum=(anwser1+anwser2);
    		
    		return sum;
        } 
    		 public static int subtractNumbers(int anwser1,int anwser2) {
    				
    	    		int diffrence=(anwser1-anwser2);
    	    		
    	    		return diffrence;
    		 }
    	    		 
    		 public static int multiplyNumbers(int anwser1,int anwser2) {
    	    				
    	    	    		int product=(anwser1*anwser2);
    	    	    		
    	    	    		return product;
    		 }    
    	    	    		 
    	    	    		
    	    	    		public static int divideNumbers(int anwser1,int anwser2) {
    	    	    				
    	    	    	    		int quoient=(anwser1/anwser2);
    	    	    	    		
    	    	    	    		return quoient;
    	    	    	        
    	    	    	         
       
}
}