import java.io.*;
import java.util.*;
class filehandling
{
    public static void main(String n[])throws IOException
    {
    FileInputStream f=new FileInputStream("textfile.txt");
    int i=0,ch;
    System.out.print(++i+":");
    while((ch=f.read())!=-1)
    {
        System.out.print((char)ch);
        if(ch=='\n')
        System.out.print(++i+":");
    }
    f.close();

    }
}