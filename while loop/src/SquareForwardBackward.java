class SquareForwardBackward 
{
    public static void main(String[] args)
    {

        int num = 1;
        int row = 1;

        while (row <= 10) 
        {
            int col = 1;
            while (col <= 10) 
            {
                System.out.print(num + "\t");
                num++;
                col++;
            }
            System.out.println();
            row++;
        }

        System.out.println("------ Reverse ------");

        num = 100;
        row = 1;

        while (row <= 10)
        {
            int col = 1;
            while (col <= 10) 
            {
                System.out.print(num + "\t");
                num--;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
