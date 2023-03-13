
import java.util.Scanner;
class Employee
        {
         int Wage=20;

        }
 public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Note:Today working hours of per day is 8 hours");
        System.out.print("");
        System.out.println( "Enter the number working hours: ");
        int WorkingHours = sc.nextInt();
        Employee ob=new Employee();
        int TotalWages=WorkingHours * ob.Wage;

        System.out.println("Employee is " +TotalWages);
    }
}