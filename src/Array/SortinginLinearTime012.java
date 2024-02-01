package Array;
import java.util.*;
public class SortinginLinearTime012 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int beg=0,mid=0,high=n-1;
		while(mid<=high)
		{
			
			if(a[mid]==0)
			{
				int temp=a[beg];
				a[beg]=a[mid];
				a[mid]=temp;
				mid++;
				beg++;
			}
			
			
			else if(a[mid]==1)
			{
				mid++;
			}
			
			else
			{
				int temp=a[high];
				a[high]=a[mid];
				a[mid]=temp;
				high--;
			}
			
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		sc.close();
	}
}
