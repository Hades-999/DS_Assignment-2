import java.util.*;
class revstring
{
	public static void main(String args[])
	{
		String s=new String();
		String r=new String();
		Scanner sc=new Scanner(System.in);
		revstring re=new revstring();
		System.out.println("Enter a String:");
		s=sc.nextLine();
		r=re.reverse(s);
		System.out.println("Reverse="+r);
	}
	public String reverse(String s)
	{
		String rev="";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
			rev+=s.charAt(i);
		return rev;
	}
}