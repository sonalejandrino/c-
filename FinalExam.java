import java.util.Scanner;

public class FinalExam
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num1 = sc.nextInt();

		oddeven(num1);
	}

	public static void oddeven(int num1)
	{
		if (num1 == 2 % 0)
			System.out.print(num1 + "is an Even number.");
		else
			System.out.print(num1 + "is an Odd number.");
	}
}