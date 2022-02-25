import java.util.Random;

public class Monopoly
{

   public static void main (String[] args)
   {
      Random r = new Random();
      
      int die1 = 0;
      int die2 = 0;
      
      int total =0;
      
      int numWins = 0;
      int numLosses = 0;
      
      for (int i = 0; i < 1000000; i++)
      {
      
         die1 = r.nextInt(6)+1;
         die2 = r.nextInt(6)+1;
         
         total = die1 + die2;
         
         //System.out.println("Total roll was : " + total);
         
         //Decide whether they win
         if(total == 7 || total ==11)
         {
            numWins++;
         }
         else
         {
            numLosses++;
         }
      
      }//end for
      
      
      System.out.println("Wins: " + numWins);
      System.out.println("Losses " + numLosses);
   
   }

}