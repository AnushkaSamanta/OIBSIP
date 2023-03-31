import java.util.*;
import java.lang.Math;
class NumberGuessingGame
{
	public static void main(String[] args)
	{
		int answer=(int) (Math.random() * 100)+1;
		int i=3;
		Scanner input=new Scanner(System.in);
		boolean correct=false;
		System.out.println("I am taking a number between 1 to 100.\nYou have 3 tries to guess the number.");
		while(i>0)
		{
			System.out.println("Enter your guessing Number:");
			int guess = input.nextInt();
			if(guess==answer)
			{
				System.out.println("You guessed the right number!\nYou win!");
				break;
			}
			else if(guess > answer)
			{
				System.out.println("Your guessing number is too high.\nYou have " + (i-1) +" tries left ");
				i--;
			}
			else
			{
				System.out.println("Your guessing number is too low.\nYou have " + (i-1) +" tries left ");
				i--;
			}
		}
			if(correct==false)
			{
				System.out.println("you ran out of tries.\nYou lose!");
			}
				
	}
}