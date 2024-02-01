
package Array;
import java.util.*;
public class BookAllocation {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++)
				sum=sum+a[i];
			int beg=0,end=sum,ans=0;
			while(beg<=end)
			{
				int mid=beg+(end-beg)/2;
				if(possible(a,n,m,mid))
				{
					ans=mid;
					end=mid-1;
				}
				else
				{
					beg=mid+1;
				}
			}
			System.out.println(ans);
			
		}
		sc.close();
	}
	
	public static boolean possible(int a[],int n,int m,int mid)
	{
		int s=1,sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>mid)
			return false;
			sum=sum+a[i];
			if(sum>mid)
			{
				s++;
				if(s>m)
					return false;
				sum=a[i];
			}
		}
	
			return true;
	}
}
