package Array;
import java.util.*;
public class MaximumCircularSum {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int maxsum=Integer.MIN_VALUE,cursum1=0,cursum2=0,minsum=Integer.MAX_VALUE,sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			
			cursum1=cursum1+a[i];
			if(cursum1>maxsum)
				maxsum=cursum1;
			if(cursum1<0)
				cursum1=0;
			
			cursum2=cursum2+a[i];
			if(cursum2<minsum)
				minsum=cursum2;
			if(cursum2>0)
				cursum2=0;
		}
		if(sum==minsum)
			System.out.println(maxsum);
		
		else
			System.out.println(Math.max(maxsum,(sum-minsum)));
		}
		sc.close();
	}
}
