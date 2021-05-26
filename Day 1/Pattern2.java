import java.util.*;

public class Pattern2
{
	 public static void main(String[] st)
	 {
		 Scanner scan=new Scanner(System.in);
		 int n,i,j;
		 System.out.print("ENTER ROWS:");
		 n=scan.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
	 