public class SpencersDumbGame
{

   public static void main (String[] args)
   {
      Dice d = new Dice();
        
      int die1 = 0;
      int die2 = 0;
      
      int total = 0;
      int numWins = 0;
      int numLosses = 0;
      
      //Simulate the roll of the die 1000 times
      for (int i = 1; i <+ 1000; i++)
      {
         //rolling the die
                  
         total = d.rollDice(2);
         
         //deciding the outcome
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
      System.out.println("Losses: " + numLosses);   
   }
}