import java.util.Scanner;

class Program58
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
        
        //Input Filter
        if(iNo <= 0)
        {
            System.out.println("Invalid Input");

            return ;    //return chay pudhe kahich nahi karan function chi return value void aahe.
        }

        for(icnt=1; icnt<=iNo; icnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}