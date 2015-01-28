import java.util.*;
import java.io.*;
          
class Problem
{
   public static void main (String[] args) throws IOException
   {
      Scanner file = new Scanner( new File( "pr03.dat" ) );
      int numberOfLinesOfData = file.nextInt();      
      file.nextLine();
      
      
      for( int n = 0; n < numberOfLinesOfData; n++ )
      {
        ArrayList myArray= new ArrayList();	
        String sentense= file.nextLine();
      	String[] words= sentense.split(" ");
      	
      	for(int i=0; i<words.length;i++)
      		{
      		words[i] = words[i].replaceAll("[^\\p{L}\\p{Nd}]+", ""); 
      		}
      	for(int i)

      	
      	
      	
      	
      }
      
      
   }
}