import java.util.*;
class UpperLower
{
	public static void main(String args[])
	{
		String s=new String();	
		String r=new String();
		Scanner sc=new Scanner(System.in);
		UpperLower u=new UpperLower();
		System.out.println("Enter a String:");
		s=sc.nextLine();
		r=u.change(s);
		System.out.println("After reversing the cases:"+r);
	}
	public String change(String s)
	{
		String r="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]+=32;
				r+=ch[i];
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				ch[i]-=32;
				r+=ch[i];
			}
			else
				r+=ch[i];
		}
		return r;
	}
}