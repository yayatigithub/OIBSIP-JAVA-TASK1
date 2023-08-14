import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         String play = "YES";
         int round = 0, totalScore = 0, totalTries = 0;
         System.out.println();
         System.out.println("##### NUMBER GUESSING GAME #####");
         System.out.println("A number is chosen between 1 to 100. Guess the number within 5 tries");
         while(play.equals("YES"))
         {
             ++round;
             int guess, i, k = 5, tries = 0, score = 5;
             Random rand = new Random();
             int number = rand.nextInt(100);
             for (i=0;i<k;i++)
             {
                 System.out.println();
                 System.out.print("Guess the number: ");
                 guess = sc.nextInt();
                 if (number == guess)
                 {
                    tries++;
                    System.out.println("Kudos!! You guessed the number.");
                    System.out.println();
                    result(tries,score);
                    totalTries += tries;
                    totalScore += score;
                    System.out.println();
                    System.out.println("Would you like to play again? YES or NO: ");
                    play = sc.next().toUpperCase();
                    break;
                 }
                 else if (number > guess && i != k-1)
                 {
                     System.out.println("The number is greater than " + guess);
                     tries++;
                     score--;
                 }
                 else
                 {
                     System.out.println("The number is less than " + guess);
                     tries++;
                     score--;
                 }
             }
             if (i == k)
             {
                 System.out.println("You have used all the 5 tries");
                 System.out.println("The number was: " + number);
                 totalTries += tries;
                 totalScore += score;
                 result(tries,score);
                 System.out.println();
                 System.out.println("Would you like to play again? YES or NO: ");
                 play = sc.next().toUpperCase();
             }
         }
         System.out.println("***************SCORECARD**************");
         System.out.println("--------------------------------------");
         System.out.println("| Rounds | Total_Tries | Total_Score |");
         System.out.println("--------------------------------------");
         System.out.println("|    "+round+"   |      "+totalTries+"      |      "+totalScore+"      |");
         System.out.println("--------------------------------------");
    }
    static void result(int tries, int score)
    {
        System.out.println();
        System.out.println("---------------------");
        System.out.println("|  TRIES  |  SCORE  |");
        System.out.println("---------------------");
        System.out.println("|    "+tries+"    |     "+score+"   |");
        System.out.println("---------------------");
    }
}
