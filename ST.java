import java.util.StringTokenizer;
import java.util.Scanner;
class ST
{
    public static void main(String[] args)
    {
     String s="My name is Gokul Krishna B";
     StringTokenizer st=new StringTokenizer(s,"k");
     while(st.hasMoreTokens())
           System.out.println(st.nextToken());   
    }
}
