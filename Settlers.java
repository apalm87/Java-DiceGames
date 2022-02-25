public class Settlers
{
   public static void main (String[] args)
   {
      Dice d = new Dice();
      
      int total = 0;
      
      total = d.rollDice(2);
      
      System.out.println(total);
      
   }
}