import java.util.*;

public class RNG {
   public int count=0, lowGuess=0, highGuess=99;
   public int randNum=RNG.rand(100);
   Scanner sc= new Scanner(System.in);

//Randon function to generate random a number
   public static int rand(int num)
   {
       int randNum = 1 + (int)(num* Math.random());
       return randNum;
   }


   public void resetCount()
   {
       count=0;
   }


   public int getCount()
   {
       count++;
       return count;
   }

//validation method
   public void inputVaidation(int guess, String name)
   {
       System.out.println("Number of guesses is : "+getCount());
       while(guess!=randNum)
       {
           if(guess<randNum)
           {
               System.out.println("Your guess is too low");
               lowGuess=guess;
               System.out.println("Enter your next guess between "+guess+" and "+highGuess);
               inputVaidation(sc.nextInt(),name);
               break;
           }
           else if(guess>randNum)
           {
               System.out.println("Your guess is too high");
               highGuess=guess;
               System.out.println("Enter your next guess between "+lowGuess+" and "+guess);
               inputVaidation(sc.nextInt(), name);
               break;
           }
       }
       if(guess == randNum )
       {  
               System.out.println("Congragulations "+name+", you guessed correctly");
               System.out.println("Try again? (yes or no)");
               String str = sc.next();
               if(str.equals("YES") || str.equals("yes"))
               {
                   resetCount();
                   lowGuess=0;
                   highGuess=99;
                   RandomNumberGuesser.main(null);
               }
               else if(str.equals("NO") || str.equals("no"))
               {
                   System.out.println("Thanks for playing "+name);
                   resetCount();
                   lowGuess=0;
                   highGuess=99;
                  
               }
       }
   }
}
class RandomNumberGuesser extends RNG
{
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter player name :");
       String name = sc.next();
       System.out.println("Enter your first guess : ");
       RandomNumberGuesser rng = new RandomNumberGuesser();
       rng.inputVaidation(sc.nextInt(), name);
      
   }
}