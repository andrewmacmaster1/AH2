import java.util.Scanner;

public class Solution
{
    public static boolean isPrime(int num)
        {
            for (int i = 2; i < 11; i++)
            {
                if (num % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    
    public static void main(String[] args)
    {   
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter a number up to 100 to check if it is prime: ");
        int check_num = console.nextInt();

        int num = 0;

        if (isPrime(check_num))
        {
            System.out.println(check_num + " is prime");
        }
        else
        {
            System.out.println(check_num + " is not prime");
        }
    }
}