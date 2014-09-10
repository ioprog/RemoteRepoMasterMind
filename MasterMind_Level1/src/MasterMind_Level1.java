
/**
 * Write a description of class MasterMind_NoOOP_Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MasterMind_Level1
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
	  char c;
	  do
	  {
          play();
	      System.out.print("Once more? (Y/N): ");
          String s = scan.next();
	      c = s.charAt(0);
	  } while (c == 'y' || c == 'Y');
	  
	  System.out.println("Game over!");
	  
	  System.out.println("Thanks for using the program!");
   }
   
   public static void play()
   {
	   //int i;
	   int fourDigits[] = new int[4]; 
       //int guessDigits[] = new int[4];
    
	   secretDigits(fourDigits);
	   
	   //i = 0;
	   //do
	   //{
	   //    guessDigits(guessDigits);
	   //    i++;
	   //} while (controlOfDigits(fourDigits, guessDigits));
	   //System.out.println("Correct! " +  i + " try/tries");
	   
	   for (int i = 0; i < fourDigits.length; i++)
	   {
	      System.out.print(fourDigits[i]);
	   }
	   System.out.println();
	   
   }
   
    public static void secretDigits(int f[])
    {
	   Random r = new Random();//import java.util.;
       
	   for (int i = 0; i < 4; i++) 
	   {
	       //Generate random number between 0 - 9
	       f[i] = Math.abs(r.nextInt()) % 10;
            
	       for (int j = 0; j < i; j++)
		   //Check that the last digit not has been selected before
		   if (f[i] == f[j])
		   {
		       //System.out.println("Siffra: " + f[i]);
			   i--;
			   break;
		   }
       }
    
    }   
}