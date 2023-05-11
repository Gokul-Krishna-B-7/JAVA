import java.util.*;
class array_index_outofbound
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size of array:");
  int s=sc.nextInt();
  System.out.println("Enter the elements in the array:");
  int a[]=new int[s];
  for(int i=0;i<s;i++)
     a[i]=sc.nextInt();
  System.out.println("Enetr the position of the number to be printed:");
  int k=sc.nextInt();
  try
  {
    System.out.println("The number is "+a[k-1]);
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
    System.out.println(e.getMessage());
  }
 }
}
 