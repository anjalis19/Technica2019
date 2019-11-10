import java.util.Scanner;
import java.text.DecimalFormat;

public class Code1 {
	public static void main (String args []){
		Scanner in = new Scanner(System.in);
		System.out.println("\tWelcome to sheStarts!");
		System.out.println("Here at sheStarts, we work to inspire and aide women of all ages on their journey to entrepreneurship! Let's get started!");
		
		String age;
		String option;
		String store;
		String storeName;
		String path;
		double moneyInvested;
		int numWorkers;
		double timeOpened;
		double profit;
		double balance;
		double totalProfit = 0;
		String businessName;
			System.out.println("Let's get to know you! \nHow old are you?(choose either a or b): \na) under 18 years old \nb) 18 years old or over");
			age = in.nextLine();
			if (age.equalsIgnoreCase("A")) {
				System.out.println("Let's get to know you! \nHow old are you?(choose either a or b): \na) under 18 years old \nb) 18 years old or over");
	         	age = in.nextLine();
	         	if (age.equalsIgnoreCase("A")) { 
	         	 double lemonadeCost;
	         	 int cupsPerHr = 4;
	             	System.out.println("  	Welcome to your Lemonade Stand!!!  	");
	             	System.out.println("Please name your lemonade stand: ");
	             	businessName = in.nextLine();
	             	
	             	System.out.println("Here's how it works: You will have 5 days to run your lemonade stand.  ");
	             	System.out.println("Try to make the most profit you can throughout these ten days. One cup ");
	             	System.out.println("of lemonade costs $0.50 to make. Please adjust the following variables ");
	             	System.out.println("accordingly: how much you want to invest, your business hours, and the cost");
	             	System.out.println("of one cup of lemonade. Good luck!!! \n");
	             	
	             	System.out.println("Press enter to begin!!!");
	             	in.nextLine();
	             	
	             	System.out.println("How much money would you like to invest in your business (for a period of 5 days)? ");
	              	moneyInvested = in.nextDouble();
	             	for (int i = 1; i <= 5; i ++) {
	             	 System.out.println("Day " + i);
	               	System.out.println("How long will your business be open? (max is 6 hours) ");
	               	timeOpened = in.nextDouble();
	               	System.out.println("How much $ will one cup of lemonade cost? ");
	               	lemonadeCost = in.nextDouble();
	               	profit = (timeOpened * lemonadeCost * cupsPerHr);
	               	totalProfit += profit;
	               	System.out.println("Your profit for day " + i + " is $" + profit);
	             	}
	             	System.out.println("Your total profit is $" + totalProfit);
	             	balance = moneyInvested - totalProfit;
	             	System.out.println("Your balance is $" + balance);

				
				
			}
			else if (age.equalsIgnoreCase("B")){
				System.out.println("What is your buisiness(choose either a, b, c): \na) restaurant \nb) retail \nc) online shop");
				store = in.nextLine();
				System.out.println("What will the name of your comany?");
				storeName = in.nextLine();
				System.out.println("To help you with your store " + ", " + storeName + ", we have some activities to help you kick off!\nWould you like to (choose a letter)\na) learn about common misconceptions about entreprenteurship");
				path = in.nextLine();
				if (path.equalsIgnoreCase("A")) {
					int done = trueFalse();
					//MYTH: Entrepreneurs are virtually all men, because men are more likely to start their own business
					if(done == 1) {
						System.out.println("Thank you for visting our site! Good luck on your journey!");

					}
				}
				
				
			}
			else {
				System.out.println("Sorry, that is not a valid input");

			}}
			
		}
		
		
	
	
	public static int trueFalse(){
		Scanner in = new Scanner(System.in);
		String ToF;
		String result;
		//introduction + question 1
		System.out.println("Enter T (true) or F (false) for each of the statements based on what you think they are:\nEntrepreneurs are virtually all men, because men are more likely to start their own business");
		ToF = in.nextLine();
		if(ToF.equalsIgnoreCase("T")) {
			result = "That's not right!";
		}
		else {
			result = "Correct!";
		}
		System.out.println(result + " According to the Megaphone of Main Street, women are more likely than men to start a business, with 47% of women vs 44% of men poled answering yes to starting a business in the last year");
		//question 2
		System.out.println("Women-owned businesses are mostly “lifestyle” businesses");
		ToF = in.nextLine();
		int done = 0;
		if(ToF.equalsIgnoreCase("T")) {
			result = "That's not right!";
		}
		else {
			result = "Correct!";
		}
		System.out.println(result + " According to stream.com, 62% of women entrepreneurs that depend on their business as their primary source of income!");
		//question 3
		System.out.println("There are scores of women, like me, who helm corporations and have a demanding family life, but still manage to squeeze in some ‘me time’ for themselves on a daily basis.");
		ToF = in.nextLine();
		if(ToF.equalsIgnoreCase("T")) {
			result = "Correct!";
		}
		else {
			result = "That's not right!";
		}
		System.out.println(result + " It is very possible! Your personal life should not interfere with your ability to run a successful buisiness");
		//question 4
		System.out.println("Entrepreneurship is almost exclusively for men.");
		ToF = in.nextLine();
		if(ToF.equalsIgnoreCase("T")) {
			result = "That's not right!";
		}
		else {
			result = "Correct!";
		}
		System.out.println(result + " According to the \"Women-Owned Business Report,\" there are approximately 11.6 million women-owned businesses in the U.S. This represents a 114 percent increase over the past 20 years and this figure continues to grow. ");

		 done = 1;
		return done;
	}
	
		
		
}
		