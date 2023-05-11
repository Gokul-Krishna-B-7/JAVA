import java.util.*;
class SecondLargest
{
	public static void main(String[] args) 
	{
		int a,b=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enetr the elements:");
		for(i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		a=arr[0];                 //assuming currently a as the largest
		for(i=1;i<n;i++)
			{
				if(arr[i]>a)
				  {
					b=a;
					a=arr[i];     //(after this 2nd largest will be in a)
				  }	
				else if(arr[i]>b)
				  b=arr[i];       //check weather the new element inserted is less than the greatest and more than the second largest
			}
		System.out.println("Second largest element in an array is "+b);
	}
}
 
