package Fundamental;
import java.util.*;

public class PatternDoubleSidedArrow {

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sp1=n-1,sp2=-1,val;
	for(int row=1;row<=n;row++)
	{
		if(row<=n/2)
		{
			val=row;
		}
		else
		{
			val=n-row+1;
		}
		
		for(int i=1;i<=sp1;i++)
			System.out.print("  ");
		
		for(int i=val;i>=1;i--)
			System.out.print(i+" ");
		
		for(int i=1;i<=sp2;i++)
			System.out.print("  ");
		
		if(row==1 || row==n)
			val=-1;
		
		for(int i=1;i<=val;i++)
			System.out.print(i+" ");
		
		System.out.println();
		
		if(row<=n/2)
		{
			
			sp1=sp1-2;
			sp2=sp2+2;
			val++;
		}
		else
		{
			sp1=sp1+2;
			sp2=sp2-2;
			val--;
		}
	}
	sc.close();
}
}
