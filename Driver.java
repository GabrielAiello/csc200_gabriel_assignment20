package homeworkassignment20;

import java.util.Random;

public class Driver 
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers = new int[10];
		Driver.fillArrayWithRandomInts(arrayOfNumbers);
		Driver.printIntArray(arrayOfNumbers);
		Driver.bubbleSort(arrayOfNumbers);
		Driver.printIntArray(arrayOfNumbers);
	}
	
	static void bubbleSort(int[] ar)
	{
		boolean swapped = false;
		while(swapped = false)
		{
			int[] answer = new int [ar.length];
			swapped = true;
			for (int i = 0; i < ar.length; i++)
			{
				int p = i-1;
				if(ar[p] > ar[i])
				{
					ar[i] = p;
					ar[p] = i;
					swapped = false;
				}
			}
		}
	}
	
	
	
	
	static void ghettoSort(int[] ar)
	{
		int[] answer = new int [ar.length];
		int[] arCopy = new int[ar.length];
		Driver.copyArray(ar, arCopy);
		int posOfSmallest;
		int currPos = 0;
		while(arCopy.length > 0)
		{
			posOfSmallest = Driver.positionOfSmallest(arCopy);
			answer[currPos] = arCopy[posOfSmallest];
			currPos++;
			arCopy = Driver.removeAtPos(posOfSmallest, arCopy);
		}
	}
	
	static void copyArray(int[] source, int[] destination)
	{
		for(int i = 0; i < source.length; i++)
		{
			destination[i] = source[i];
			
		}
	}
	static int[] removeAtPos(int pos, int[] ar)
	{
		int[] answer = new int[ar.length - 1];
		int curPos = 0;
		for(int i = 0; i < pos; i++)
		{
			answer[curPos] = ar[i];
			curPos++;
		}
		for(int i = pos+1; i < ar.length; i++)
		{
			answer[curPos] = ar[i];
			curPos++;
		}
		return answer;
		
	}
	static int positionOfSmallest(int[] ar)
	{
		int winnerPos = 0;
		for(int i = 1; i < ar.length; i++)
		{
			if(ar[i] < ar[winnerPos])
			{
				winnerPos = i;
			}
		}
		return winnerPos;
	}
	static void fillArrayWithRandomInts(int[] ar)
	{
		Random r = new Random();
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = r.nextInt(101);
		}
	}
	static void printIntArray(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}