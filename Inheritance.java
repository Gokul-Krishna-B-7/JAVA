import java.util.*;

class Employee
{
    void read()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter name of the employee:");
     String name=sc.nextLine();
     System.out.println("Enetr employee ID:");
     long id=sc.nextLong();
     System.out.println("Eneter the salary:");
     long salary=sc.nextLong();
     System.out.println("Enter mobile no.:");
     long mob=sc.nextLong();
    }
    void print()
    {
        System.out.println("Employee name is:"+name);
        System.out.println("Employee id is "+id);
        System.out.println("Employee salary is:"+salary);
        System.out.println("Employee mobile number is:"+mob);
    } 
}

class Manager extends Employee
{
    void sread()
    {
        Scanner sc=new Scanner(System.in);
        super.read();
        System.out.println("Enter the specialization of the manager.");
        String sp=sc.nextLine();
    }
    void sprint()
    {
        System.out.println("The specialization of the manager is "+sp);
    }
}

class Officer extends Employee
{
    void sread()
    {
        Scanner sc=new Scanner(System.in);
        super.read();
        System.out.println("Enter the department of the officer.");
        String dp=sc.nextLine();
    }
    void sprint()
    {
       System.out.println("The department of the"); 
    }
}

class Inheritance
{
 public static void main(String[] args)
 {
    Officer objo=new Officer();
    Manager objm=new Manager();
    
 }   
}
