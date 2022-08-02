/*Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a
dozen. Write a program that prompts a user for the number of eggs in the
order and then display the amount owed with a full explanation. For example,
typical output might be, You ordered 27 eggs. That’s 2 dozen at $3.25 per
dozen and 3 loose eggs at 45 cents each for a total of $7.85. Save the program
as Eggs.java.*/

import java.util.Scanner;
public class Eggs 
{
	public static void main (String [] args)
	{
		final int DOZEN_EGGS = 10;
		final double DOZEN_PRICE = 3.25;
		final double INDIVIDUAL_PRICE = 0.45;
		int indEggs;
		int dozens;
		int order;
		double dozensCost;
		double indCost;
		double total;
		
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter your order >> ");
		order = input.nextInt();
		
		dozens = order/DOZEN_EGGS;
		indEggs = order % DOZEN_EGGS;
		
		dozensCost = dozens * DOZEN_PRICE;
		indCost = indEggs * INDIVIDUAL_PRICE;
		total = dozensCost + indCost;
		
		
		
		System.out.println("You ordered " +order+ ". That’s " +dozens+ " dozen at $3.25 per\r\n"
				+ "dozen and " +indEggs+ " loose eggs at 45 cents each for a total of $" +total+ ".");
	
	}
	
}
