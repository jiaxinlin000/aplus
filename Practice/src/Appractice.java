import java.util.*;
import java.io.*; 
public class Appractice
	{

	public static void main(String[] args)
		{
		// TODO Auto-generated method stub
		maxNumber(myArray);
		minNumber(myArray);
		averageNumber(myArray);
		
		}
	
	public static void maxNumber (int[][]myArray)
		{
		int max= myArray[0][0];
		for(int r=0; r<myArray.length;r++)
			{
			for(int c=0; c<myArray[0].length; c++)
				{
				if(myArray[r][c]>max)
					{
					max=myArray[r][c]; 
					}
				}
			}
		System.out.println(max); 
		}
	public static void minNumber (int[][]myArray)
		{
		int min= myArray[0][0];
		for(int r=0; r<myArray.length;r++)
			{
			for(int c=0; c<myArray[0].length; c++)
				{
				if(myArray[r][c]<min)
					{
					min=myArray[r][c]; 
					}
				}
			}
		System.out.println(min);
		}
	
	public static void averageNumber(int [][]myArray)
		{
		int sum=0;
		int total=0; 
		for(int r=0; r<myArray.length;r++)
			{
			for(int c=0; c<myArray[0].length; c++)
				{
				sum+=myArray[r][c]; 
				total++;
				}
			}
		
		double average= sum/total; 
		System.out.println(average);
		}

	}

