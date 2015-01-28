import java.util.Scanner;

public class WhileLoop
	{

	public static void main(String[] args)
		{
		// TODO Auto-generated method stub
		String[] polo =
			{ "blue", "white", "yellow", "gray", "dark blue" };
		String nextPolo = polo[(int) (Math.random() * 5)];
		System.out.println(nextPolo);
		switch (nextPolo)
			{
			case "white":
			case "gray":
			case "dark blue":
			case "yellow":
				{
				System.out.println("It is a good color");
				break;
				}
			case "blue":
				{
				System.out.println("It is not a good color");
				break;
				}
			}

		// 1

		int total = 0;
		int number = 0;
		while (number < 90)
			{
			number = (int) (Math.random() * 100) + 1;
			total++;
			}
		if (total == 1)
			System.out
					.println("It took you 1 try to generate a number ninety or above.");
		else
			System.out.println("It took you " + total
					+ " tries to generate a number ninety or above.");

		// 2

		Scanner keyboard = new Scanner(System.in);
		boolean answerYes = true;
		do
			{
			int randomNumber = (int) (Math.random() * 100000) + 1;
			System.out.println(randomNumber);
			System.out.println("Do you want to continue?");
			String answer = keyboard.nextLine();
			switch (answer)
				{
				case "No":
				case "NO":
				case "no":
					{
					answerYes = false;
					break;
					}

				case "Yes":
				case "yes":
				case "YES":
					{
					answerYes = true;
					break;
					}
				}
			System.out.println(answerYes);
			}
		while (answerYes);
		System.out.println("Goodbye");
		

		}

	}
