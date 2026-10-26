import java.util.Scanner;

class Program66
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
        int icnt=0; //default value sathi 
        icnt = 1;   // loop count sathi
        
        while(icnt <= iNo ) //while la head checking loop mntat
        {
            System.out.println("-------------");
            System.out.println(icnt + " jay Ganesh...");
            System.out.println("-------------");

            icnt++;
        }
    }
}