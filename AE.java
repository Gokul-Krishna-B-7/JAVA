import java.util.*;
class AE
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter 2 nos: ");
  int s=sc.nextInt();
  int a=sc.nextInt();
  
  try
  {
    System.out.println("The number is " +s/a);
  }
  catch(ArithmeticException e)
  {
    System.out.println(e.getMessage());
  }
 }
}
