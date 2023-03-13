
import java.util.Scanner;
class Employee
        {
            int Hours=8;
            String p="Present";
            String a="Absent";
            int Wage=20;
        }
 public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Note:Today working hours of per day is 8 hours");
        System.out.print("");
        System.out.println( "Enter working hours: ");
        int WorkingHours = sc.nextInt();
        Employee ob=new Employee();
        int TotalWages=WorkingHours * ob.Wage;
        switch(WorkingHours){
            case 1:
                System.out.println("Employee total wages for per day is " +TotalWages);
                System.out.println( "Employee working in full time and " +ob.p);
                break;

            case 2:
                System.out.println("Employee total wages for per day is " +TotalWages);
                System.out.println( "Employee working in full time and " +ob.p);
                break;

            case 3:
                System.out.println("Employee total wages for per day is " +TotalWages);
                System.out.println( "Employee working in full time and " +ob.p);
                break;
            case 4:
                System.out.println("Employee total wages for per day is " +TotalWages);
                System.out.println( "Employee working in full time and " +ob.a);
                break;
            case 5:
                System.out.println("Employee total wages for per day is " +TotalWages);
                System.out.println( "Employee working in full time and " +ob.p);
                break;
            case 6:
                System.out.println("Employee total wages for per day is " +TotalWages);
                System.out.println( "Employee working in full time and " +ob.a);
                break;
            case 7:
                System.out.println("Employee total wages for per day is " +TotalWages);
                System.out.println( "Employee working in full time and " +ob.p);
                break;
            case 8:
                System.out.println("Employee total wages for per day is " +TotalWages);
                System.out.println( "Employee working in full time and " +ob.a);
                break;
                default:
                System.out.println("Please check the input");

        }
    }
}