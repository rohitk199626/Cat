import java.util.*;

public class Cube
{
	public static void main(String[] args)
	{
		Random rnum = new Random();
		Scanner sc = new Scanner(System.in);
		int n,cube,userInput,count=0,i;
		int x,y,numCount;
		System.out.println("You have to type cube of given number");
		System.out.println("Enter range of numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		numCount = y-x+1;
		int a[] = new int[y+2];
		for(i=x;i<=y;i++)
		{
			a[i]=0;
		}
		
		while(count!=numCount)
		{
			n=rnum.nextInt(numCount)+x;
			if(a[n]==1)
				continue;
			System.out.println(n);
			userInput = sc.nextInt();
			cube = n*n*n;
			if(cube==userInput)
			{
				System.out.println("Right");
				count++;
				a[n]=1;
			}
			else
			{
				System.out.println("Wrong");
			}
		}
	}
}