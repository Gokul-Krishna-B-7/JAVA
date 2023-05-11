import java.util.Scanner;
class Fibonacci_less
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the limit:");
   int count = sc.nextInt();
   int n1=0,n2=1,n3,i;
   if(count<0)
   {
    System.out.println("Invalid Input");
   }
   else if(count==0)
   {
    System.out.println("The fibonacci series upto "+ count +" are:");
    System.out.println(n1);
   }
   else if(count==1)
   {
    System.out.println("The fibonacci series upto "+ count +" are:");
    System.out.print(n1+" "+n2);//printing 0 and 1 
   }
   else
   {
    System.out.print(n1+" "+n2);
    for(i=2;i<count+3;++i)//loop starts from 2 because 0 and 1 are already printed  
       {  
        n3=n1+n2; 
        if(n3>count)
          break; 
        System.out.print(" "+n3);  
        n1=n2;  
        n2=n3;  
       }  
   }
 }
}

