import java.util.*;

public class Pattern3
{
	public static void main(String[] st)
	{
		Scanner scan=new Scanner(System.in);
		int n,i,j,m=1;
		System.out.print("ENTER ROWS:");
		n=scan.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
		
			for(j=1;j<=m;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			m=m+2;
		}
	}
}
	 