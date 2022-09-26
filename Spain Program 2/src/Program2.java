//Application: Program 2
//Name: Michael Spain
//GitHub User: Michael91S 
//Date: Sep 23, 2022
//Version: 1.0
//Description: Scanners, switch statements, and if statements

//scanner
import java.util.Scanner; 

public class Program2 {

	public static void main(String[] args) {
		
		//Start scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Ask user for 3 numbers 
		System.out.println("Pick your first number?");
		int firstNum = keyboard.nextInt();
		System.out.println("Pick your second number?");
		int secNum = keyboard.nextInt();
		System.out.println("Pick your third number?");
		int thirdNum = keyboard.nextInt();
		
		//Menu
		System.out.println("\nMenu");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		
		//Read menu choice input
		System.out.println("\nMenu Choice?");
		int menuChoice = keyboard.nextInt();
		
		//Complete menu statement by the choice input
		//Output the menu choice number is greater, less than, or equal to thirdNum
		switch(menuChoice)
		{
		case 1:
			int addTotal = firstNum + secNum;
			System.out.println("\nYour numbers added together equal: " + addTotal);
			if (addTotal > thirdNum)
			{
				System.out.println("\n" + addTotal + " Is greater than " + thirdNum);
			}
			if (addTotal < thirdNum)
			{
				System.out.println("\n" + addTotal + " Is less than " + thirdNum);
			}
			if (addTotal == thirdNum)
			{
				System.out.println("\n" + addTotal + " Is equal to " + thirdNum);
			}
			break;
		
		case 2:
			int subTotal = firstNum - secNum;
			System.out.println("\nYour numbers subtracted from each other equal: " + subTotal);
			if (subTotal > thirdNum)
			{
				System.out.println("\n" + subTotal + " Is greater than " + thirdNum);
			}
			if (subTotal < thirdNum)
			{
				System.out.println("\n" + subTotal + " Is less than " + thirdNum);
			}
			if (subTotal == thirdNum)
			{
				System.out.println("\n" + subTotal + " Is equal to " + thirdNum);
			}
			break;
		
		case 3:
			int mulTotal = firstNum * secNum;
			System.out.println("\nYour numbers multiplied together equal: " + mulTotal);
			if (mulTotal > thirdNum)
			{
				System.out.println("\n" + mulTotal + " Is greater than " + thirdNum);
			}
			if (mulTotal < thirdNum)
			{
				System.out.println("\n" + mulTotal + " Is less than " + thirdNum);
			}
			if (mulTotal == thirdNum)
			{
				System.out.println("\n" + mulTotal + " Is equal to " + thirdNum);
			}
			break;
		
		case 4:
			int divTotal = firstNum / secNum;
			System.out.println("\nYour numbers divided by each other equal: " + divTotal);
			if (divTotal > thirdNum)
			{
				System.out.println("\n" + divTotal + " Is greater than " + thirdNum);
			}
			if (divTotal < thirdNum)
			{
				System.out.println("\n" + divTotal + " Is less than " + thirdNum);
			}
			if (divTotal == thirdNum)
			{
				System.out.println("\n" + divTotal + " Is equal to " + thirdNum);
			}
			break;
			
		default:
				System.out.println("Not on menu");
		}	
	}
}