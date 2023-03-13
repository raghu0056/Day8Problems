
import java.util.Random;
class Employee
        {
            String p="Present";
           String a="Absent";
        }
 public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int value = rand.nextInt(100);
        Employee ob=new Employee();
        if(value < 50)
     {
         System.out.println("Employee is " +ob.p);
     }
     else
     {
         System.out.println("Employee is " +ob.a);
     }
    }
}