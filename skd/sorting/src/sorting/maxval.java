package sorting;

import java.util.Scanner;

public class maxval {
public static void main(String args[])
{
	int arr[];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	System.out.println("enter the elements of array");
	arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int maxval=arr[0];
	for(int i=1;i<=n-1;i++)
	{
		if(arr[i]>maxval)
			maxval=arr[i];
	}
	System.out.println("maxvalue is:"+maxval);
	
}
}
	



