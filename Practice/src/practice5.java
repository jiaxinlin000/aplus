import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class practice5
	{
	public static void main (String[] args) throws IOException
	   {
	      exe(2); 
	      
	      
	   }
	
	
	public static void exe(int hi)
		{
			int n; 
			
			try
				{
					
						Object o= Integer.valueOf(hi);
						String str= (String) o;
						System.out.println(str);
						
					
						
					
						
					}
			catch(ClassCastException exc)
				{
				System.out.println("hi");
			
				}
			try
				{
				String hello=null; 
				 int space=hello.indexOf(" ");
				 System.out.println(space);
				
				}
			catch(NullPointerException exc)
				{
				System.out.println("hello");
				}
			try
				{
				String s="hi";
				int i= Integer.parseInt(s);
				System.out.println(i);
				
				
				}
					
				
			
			
			catch(NumberFormatException exc)
				{
				System.out.println("o");
				}
			finally
			{
			System.out.println("Done");
			}
			
			
		}
	
	}

	
