import java.util.*;
class Fibonacci
{
 public static void main(String args[])
  { 
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the no. of terms required:");
   int count = sc.nextInt();
   int n1=0,n2=1,n3,i;
   if(count<0)
    System.out.println("Invalid Input");
   else if(count==0)
   {
    System.out.println("The fibonacci series of "+ count +" terms are:");
    System.out.println("None");
   } 
   else if(count==1)
   {
    System.out.println("The fibonacci series of "+ count +" terms are:");
    System.out.print(n1);
   } 
   else if(count==2) 
   {
    System.out.println("The fibonacci series of "+ count +" terms are:"); 
    System.out.print(n1+" "+n2);//printing 0 and 1  
   } 
   else
    {
     System.out.println("The fibonacci series of "+ count +" terms are:"); 
     System.out.print(n1+" "+n2);
     for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
        {  
         n3=n1+n2;  
         System.out.print(" "+n3);  
         n1=n2;  
         n2=n3;  
        }  
    }
  }
}
