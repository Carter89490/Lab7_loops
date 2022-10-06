import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        double celcius = 0;
        double farinheight = 0;
        String trash = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);


        do
        {
            {
                System.out.print("What is the temperature in celcius");

                if (in.hasNextInt())
                {
                    celcius = in.nextInt();
                    in.nextLine();
                    farinheight = celcius * 1.8 + 32;
                    System.out.println("The temperature in farinheight is " + farinheight);
                    done = true;
                }
                else
                {

                    trash = in.nextLine();
                    System.out.println("\nYou said the temperature was: " + trash);
                }
            }
        }while (!done) ;
    }
}


