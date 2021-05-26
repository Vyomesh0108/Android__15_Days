import java.util.*;

public class StrCountVowel
{
	public static void main(String[] st)
	{
		Scanner scan=new Scanner(System.in);
		String s;
		int v=0,c=0;
		System.out.println("ENTER STRING IN CAPITAL: ");
		s=scan.nextLine();

		System.out.print("\nSTRING: "+s);

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
		}
		System.out.print("\n\nVOWELS   : "+v);
		System.out.print("\nCONSONANT: "+c);
	}
}