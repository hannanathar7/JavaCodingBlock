package Fundamental;
import java.util.*;

public class Pattern17 {

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int st=n/2,sp=1;
	for(int row=1;row<=n;row++)
	{
		for(int i=1;i<=st;i++)
			System.out.print("*");
		
		for(int i=1;i<=sp;i++)
			System.out.print(" ");
		
		for(int i=1;i<=st;i++)
			System.out.print("*");
		
		System.out.println();
		
		if(row<=n/2)
		{
			st--;
			sp=sp+2;
		}
		else
		{
			st++;
			sp=sp-2;
		}
	}
	sc.close();
}
}
