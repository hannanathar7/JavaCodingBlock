package Fundamental;
import java.util.Scanner;

public class Pattern18 {

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int st=1,sp=n/2;
	for(int row=1;row<=n;row++)
	{
		
		
		for(int i=1;i<=sp;i++)
			System.out.print(" ");
		
		for(int i=1;i<=st;i++)
			System.out.print("*");
		
		for(int i=1;i<=sp;i++)
			System.out.print(" ");
		
		System.out.println();
		
		if(row<=n/2)
		{
			sp--;
			st=st+2;
		}
		else
		{
			sp++;
			st=st-2;
		}
	}
	sc.close();
}
}
