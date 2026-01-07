
public class primr 
{

	public static void main(String[] args) 
	{
        int num = 2;
	    while (num <= 100)
       {
            int i = 1;
            int count = 0;
            while (i <= num) 
	      {
	        if (num % i == 0) 
	          {
	        	count++;
	          }
	                i++;
	       }

         if (count == 2) 
         {
           System.out.println(num);
	     }
            num++;
	    }

	}

}
