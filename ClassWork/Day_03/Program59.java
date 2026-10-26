import java.util.Scanner;

class Program59
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
        
        //Input Updater
        if(iNo < 0)
        {
            iNo = -iNo;   // - & - = + then value gives Positive number
                
        }

        for(icnt=1; icnt<=iNo; icnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}