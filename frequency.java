import java.util.*;
class frequency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		frequency f=new frequency();
		String s=new String();
		char max;
		System.out.println("Enter a string:");
		s=sc.nextLine();
		max=f.maximum(s);
		System.out.println("The character with most frequency:"+max);
	}
	public char maximum(String s)
	{
		char ch[]=s.toCharArray();
		char max;
		int x=0,index=0;
		for(int i=0;i<ch.length;i++)
		{
			int c=0;
			for(int j=i;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
					c++;
			}
			if(c>x)
			{
				x=c;
				index=i;
			}
		}
		return ch[index];
	}
}