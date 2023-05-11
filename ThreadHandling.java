import java.lang.*;

class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Odd numbers are: ");
        for(int i=1;i<100;i=i+2)
            System.out.print(i+" ");
        System.out.println();    
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Even numbers are: ");
        for(int i=2;i<100;i=i+2)
            System.out.print(i+" ");
        System.out.println();
    }
}
class ThreadHandling
{
    public static void main(String[] args)throws InterruptedException
    {
     Thread1 sc1=new Thread1();
     Thread2 sc2=new Thread2();
     sc1.start();
     sc1.join();
     sc2.start();   
    }
}
