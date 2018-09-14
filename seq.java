import java.util.*;
class seq
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		seq s=new seq();
		String str=new String();
		System.out.println("Enter a string:");
		str=sc.nextLine();
		s.fun(str);
	}
	public void fun(String s)
	{
		int i,j;
		for(i=0;i<s.length();i++)
		{
			for(j=i;j<=s.length();j++)
			{
				int x=i;
				while(x!=j)
				{
					System.out.print(s.charAt(x));
					x++;
				}
				System.out.println();
			}
		}
	}
}