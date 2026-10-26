import java.util.Scanner;

class Program65
{
    public static void main(String A[])
    {    
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the Frequency :");
        iValue = scanner.nextInt();
        
        Iteration iteration = new Iteration();
                
        iteration.display(iValue);
           
    }
}

class Iteration
{
    public void display(int iNo)
    {
        int icnt=0;
        
        for(icnt = iNo; icnt >= 1; icnt--)
        {
            System.out.println("-------------");
            System.out.println(icnt + " jay Ganesh...");
            System.out.println("-------------");

        }
    }
}