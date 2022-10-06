public class Main
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 30; i++)
            System.out.print(i + " ");
        System.out.println(" ");

        for (int x = 30; x >= 0; x--)
            System.out.print(x + " ");
        System.out.println(" ");

        for (int j = 0; j <= 18; j += 3)
            System.out.print(j + " ");
        System.out.println(" ");

        for (int t = 10; t >= 0; t -= 2)
            System.out.print(t + " ");
        System.out.println(" ");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5 - i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    System.out.println();
        for( int i = 0; i < 5; i++)
        {
            for( int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    System.out.println();
       for (int i = 0; i <= 4; i++)
        {
            for (int x = 4; x >= 0; x--)
            {
                System.out.print("*");
                ;
            }
            System.out.println();

        }
    }

}

