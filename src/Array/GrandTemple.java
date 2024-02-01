package Array;
import java.util.*;
public class GrandTemple {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			b[i]=sc.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		long max1=0,max2=0,diff1=0,diff2=0,ar=0;
		
		
		for(int i=0;i<n-1;i++)
		{
			diff1=Math.abs(a[i+1]-(a[i]+1));
			if(diff1>max1)
				max1=diff1;
		}
		
		for(int i=0;i<n-1;i++)
		{
			diff2=Math.abs(b[i+1]-(b[i]+1));
			if(diff2>max2)
				max2=diff2;
		}
		
		
		ar=max1*max2;
		
		System.out.println(ar);
		
	
		sc.close();
	}
}
