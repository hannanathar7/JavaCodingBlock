package Array;
import java.util.*;

public class FormBiggestNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=1;t1<=t;t1++)
		{
		int n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++)
			list.add(sc.next());
		Biggest(list);
		for(int i=0;i<n;i++)
			System.out.print(list.get(i));
		System.out.println();
		}
		
		sc.close();
	}
	
	public static void Biggest(ArrayList<String> list)
	{
		Collections.sort(list,new Comparator<String> ()
				{
			@Override public int compare(String X,String Y)
			{
				String XY=X+Y;
				String YX=Y+X;
				
				return XY.compareTo(YX)>0?-1:1;
			}
				});
	}
	
}
