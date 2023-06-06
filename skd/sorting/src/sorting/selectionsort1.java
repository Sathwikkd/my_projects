package sorting;


import java.util.Random;
import java.util.Scanner;
public class selectionsort1 {
static int max=11000;
static void sort(int arr[],int n)
{
for(int i = 0; i < n - 1; i++)
{
int min_index = i;
int minStr = arr[i];
for(int j = i + 1; j < n; j++)
{
if(arr[j]< minStr)
{
minStr = arr[j];
min_index = j;
}
}
if(min_index != i)
{
int temp = arr[min_index];
arr[min_index] = arr[i];
arr[i] = temp;
}
}
}
public static void main(String[] args) {
int[] a;
int i;
System.out.println("Enter the array size");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
a= new int[max];
Random generator=new Random();
for( i=0;i<n;i++)
a[i]=generator.nextInt(20);
System.out.println("Array before sorting");
for( i=0;i<n;i++)
System.out.println(a[i]+" ");
long startTime=System.nanoTime();
selectionsort1 m=new selectionsort1();
m.sort(a,n);
long stopTime=System.nanoTime();
long elapseTime=(stopTime-startTime);
System.out.println("Sorted array is");
for(i=0;i<n;i++)
System.out.println(a[i]);
System.out.println("Time taken to sort array is:"+elapseTime+"nanoseconds");

}
}

