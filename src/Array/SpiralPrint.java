package Array;
import java.util.*;
public class SpiralPrint {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int top=0,bottom=m-1,left=0,right=n-1,dir=1,count=m*n;
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		while(top<=bottom && left<=right)
		{
			if(count>0)
			{
				if(dir==1)
				{
					for(int i=left;i<=right;i++)
					{
						System.out.print(a[top][i]+",");
						count--;
					}
					dir=2;
					top++;
				}
			}
				if(count>0)
				{
				if(dir==2)
				{
					for(int i=top;i<=bottom;i++)
					{
						System.out.print(a[i][right]+",");
						count--;
					}
					dir=3;
					right--;
				}
				}
				
				if(count>0)
				{
				if(dir==3)
				{
					for(int i=right;i>=left;i--)
					{
						System.out.print(a[bottom][i]+",");
						count--;
					}
					dir=4;
					bottom--;
				}
				}
				
				if(count>0)
				{
				
				if(dir==4)
				{
					for(int i=bottom;i>=top;i--)
					{
						System.out.print(a[i][left]+",");
						count--;
					}
					dir=1;
					left++;
				}
				}
			
		}
		sc.close();
		
	}
}
