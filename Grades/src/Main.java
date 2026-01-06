public class Main 
{
	public static void main(String[] args) 
	{
		int sub1 = 60;
        int sub2 = 55;
        int sub3 = 35;
        int sub4 = 75;
        int sub5 = 43;
		     
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
		       
        double average = sum / 5.0;

		 System.out.println("Sum" + average);

         if (average > 90) 
         {
           System.out.println("Grade: A");
         }
		        
       else if (average >= 80 && average <= 90) 
		        
         {
    	   System.out.println("Grade: B");
         }
		        
		else if (average >= 70 && average < 80) 
	     {
           System.out.println("Grade: C");
         }
		        
	    else if (average >= 60 && average < 70) 
		        
         {
	       System.out.println("Grade: D");
		            
         } 
	    else 
         {
		   System.out.println("Grade: F");
         }
         
     }
}


