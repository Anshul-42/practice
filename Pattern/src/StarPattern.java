public class StarPattern
{
   public static void main(String[] args)
  {

    System.out.println("Question 1");
      for (int r = 1; r <= 5; r++) 
      {
         for (int c = 1; c <= 5; c++) 
        {
          System.out.print("*");
        }
          System.out.println();
      }

        System.out.println();

        System.out.println("Question 2");
        for (int r = 1; r <= 5; r++) 
        {
            for (int c = 1; c <= r; c++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Question 3");
        for (int r = 5; r >= 1; r--) 
        {
            for (int c = 1; c <= r; c++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Question 4");
        for (int r = 1; r <= 5; r++) 
        {
            for (int c = 1; c <= (2 * r - 1); c++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Question 5");
        for (int r = 1; r <= 5; r++) 
        {
            for (int c = 1; c <= (2 * r - 1); c++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int r = 4; r >= 1; r--) 
        {
            for (int c = 1; c <= (2 * r - 1); c++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
      
        
        
        
        
        
        
   }
  
   
}







