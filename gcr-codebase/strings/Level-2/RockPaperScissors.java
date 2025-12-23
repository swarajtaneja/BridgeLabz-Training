import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{

         public static String generatingChoice() 
         {
               int min = 0;
               int max = 2;
               int choice = (int) (Math.random() * (max - min + 1)) + min;
               switch (choice)
               {
                    case 0: return "rock";
                    case 1: return "paper";
                    default: return "scissors";
               } 
         }

         public static String winning(String user, String computer)
         {
               if (user.equals(computer))
               {
                   return "Draw";
               }

               if ((user.equals("rock") && computer.equals("scissors")) ||(user.equals("paper") && computer.equals("rock")) ||(user.equals("scissors") && computer.equals("paper")))
              {
                    return "User";
              }
              else
              {
                 return "Computer";
              }
         }

         public static String[][] calculateStats(int userWins, int computerWins, int totalGames) 
         {
               double userPercent = (userWins * 100.0) / totalGames;
               double computerPercent = (computerWins * 100.0) / totalGames;

               String[][] stats = new String[3][3];
               stats[0] = new String[]{"Player", "Wins", "Win %"};
               stats[1] = new String[]{"User", String.valueOf(userWins), String.format("%.2f", userPercent)};
               stats[2] = new String[]{"Computer", String.valueOf(computerWins), String.format("%.2f", computerPercent)};

               return stats;
         }

         public static void displayResults(String[][] gameResults, String[][] stats)
         {
               System.out.println("\nGame Results:");
               System.out.printf("%-8s %-10s %-12s %-10s%n", "Game", "User", "Computer", "Winner");

               for (String[] result : gameResults) 
               {
                     System.out.printf("%-8s %-10s %-12s %-10s%n",
                     result[0], result[1], result[2], result[3]);
               }

               System.out.println("\nOverall Statistics:");
               for (String[] row : stats) 
               {
                   System.out.printf("%-10s %-10s %-10s%n", row[0], row[1], row[2]);
               }
         }

         public static void main(String[] args)
         {
               Scanner input = new Scanner(System.in);

               System.out.print("Enter number of games: ");
               int games = input.nextInt();

               String[][] gameResults = new String[games][4];
               int userWins = 0;
               int computerWins = 0;

               for (int i = 0; i < games; i++)
               {
                   System.out.print("Enter Your Choice: ");
                   String userChoice = input.next().toLowerCase();
                   String computerChoice = generatingChoice();
                   String winner = winning(userChoice, computerChoice);

                   if (winner.equals("User")) userWins++;
                   if (winner.equals("Computer")) computerWins++;

                   gameResults[i][0] = String.valueOf(i + 1);
                   gameResults[i][1] = userChoice;
                   gameResults[i][2] = computerChoice;
                   gameResults[i][3] = winner;
               }

               String[][] stats = calculateStats(userWins, computerWins, games);
               displayResults(gameResults, stats);

         }
}
