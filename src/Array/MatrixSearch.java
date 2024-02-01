package Array;

 import java.util.*;

 public class MatrixSearch {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		int t=sc.nextInt();
		int flag=0;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==t)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		
		System.out.println(flag);
		sc.close();
	}
}
