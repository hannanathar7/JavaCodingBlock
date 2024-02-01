package Array;
import java.util.*;
public class WinningCBScholarship {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long x=sc.nextLong();
		long y=sc.nextLong();
		long ans=0;
		long q=m/x;
		if(q>0)
		{
			m=m%x;
			n=n-q;
			if(n<=0)
			ans=n+q;
			else
			ans=ans+q;
		}
		
		while(n>1)
		{
			m=m+y;
			if(m>=x)
			{
				long q1=m/x;
				if(q1<=n)
				{
					ans=ans+q1;
					n=n-q1;
					m=m%x;
				}
				else
				{
					ans=ans+n-1;
					break;
				}
			}
			n--;	
		}
		System.out.println(ans);
		
		
		sc.close();
	}
}
