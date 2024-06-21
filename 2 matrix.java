import java.util.*;
class Matrix
{
public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the size of array:");
	n=sc.nextInt();
	int a[][]=new int[n][n];
	int b[][]=new int[n][n];
	int c[][]=new int[n][n];
	System.out.println("Enter the elemnts of the array:");
	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		{
		System.out.println("Enter element of first array:");
		a[i][j]=sc.nextInt();
		System.out.println("Enter element of second array:");
		b[i][j]=sc.nextInt();
		c[i][j]=a[i][j]+b[i][j];
		}
		
	System.out.println("Added matix:");
	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(c[i][j]);
			}
		}
	}
}
