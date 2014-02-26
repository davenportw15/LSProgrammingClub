/*
Reverses an array of ints.
*/

public class ArrayReverser
{
	public static void main(String[] args)
	{
		java.util.Scanner gets = new java.util.Scanner(System.in);
		System.out.println("Enter a set of numbers with each number separated by a space.");
		
		//Get input and split into an array of Strings, splitInput.
		String input = gets.nextLine();
		String[] splitInput = input.split(" ");
		int[] integers = new int[splitInput.length];
		
		//Copy int values of splitInput into integers.
		for (int i = 0; i < splitInput.length; i++)
		{
			try
			{
				integers[i] = Integer.parseInt(splitInput[i]);
			}
			catch (java.lang.NumberFormatException e) {
				System.out.println("Invalid input. Exiting...");
				System.exit(0);
			}
		}
		
		for (int x : reverseArray(integers))
		{
			System.out.print(x + " ");
		}

		System.out.println();
	}

	static int[] reverseArray(int[] original)
	{
		int[] reversed = new int[original.length];
		
		for (int i = 0; i < original.length; i++)
		{
			//(original.length - 1) must be used because arrays are 0-indexed, but <Array>.length is not.
			reversed[i] = original[(original.length - 1) - i];
		}

		return reversed;
	}
}
