import java.util.*;
class Starfrmright
{
	public static void main(String[] args)
	{
		int row,range,col,space;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of range");
		range=sc.nextInt();
		for(row=1;row<=range;row++)
		{
			for(space=1;space<=range-row;space++)
			{
				System.out.print(" ");
			}
			for(col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
