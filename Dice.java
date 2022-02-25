import java.util.Random;

public class Dice
{

   public int rollDice(int numDice)
   {
      Random r = new Random();
      
      int total = 0;
      
      //Simulate the roll of the die
      for (int i = 1; i <= numDice; i++)
      {
         total = total + (r.nextInt(6)+1);
      }
      
      return total;
   }

}