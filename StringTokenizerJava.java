import java.io.*;

import java.util.*;

class StringTokenizerJava
{
 public static void main(String args[])throws IOException
  {
   FileInputStream f= new FileInputStream("MyintFile.txt");
   int i=0,ch,sum=0;
   char c;
   char arr[]=new char[100];
   while((ch=f.read()) != -1)
    { 
      arr[i++]=(char)ch;
    }
   String str = String.valueOf(arr);
   System.out.print(str);
   StringTokenizer st = new StringTokenizer(str);
   while(st.hasMoreTokens())
       {
          String ch1= st.nextToken();
          try
           {
            sum=Integer.parseInt(ch1)+sum;
           }
          catch(NumberFormatException e)
           {}
       }
   System.out.println(" Sum is :"+sum);
   f.close();
  }
}

