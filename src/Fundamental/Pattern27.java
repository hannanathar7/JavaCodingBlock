package Fundamental;
import java.util.Scanner;

public class Pattern27 {

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int st=1,sp=n-1,val;
	for(int row=1;row<=n;row++)
	{
		val=1;
		
		for(int i=1;i<=sp;i++)
			System.out.print(" ");
		
		for(int i=1;i<=st;i++)
		{
			System.out.print(val);
			if(i<=st/2)
				val++;
			else
				val--;
		}
		
		for(int i=1;i<=sp;i++)
			System.out.print(" ");
		
		System.out.println();
		
		st=st+2;
		sp=sp-1;
	}
	sc.close();
}
}
