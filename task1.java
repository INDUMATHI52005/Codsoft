import java.util.Random;
import java.util.Scanner;
public class task1{
    public static void main(String[]args)
{
    Scanner scanner=new Scanner(System.in);
    Random random =new Random();
    int min=1;
    int max=100;
    int maxAttempts=5;
    int score=0;
    boolean playAgain=true;
    while(playAgain){
        int randomnumber=random.nextInt(max -min+1)+min;
        int attempts =0;
        boolean guessedcorrectly=false;
        System.out.println("Guess a number between"+min+"and"+max+"(you have"+maxAttempts+"attempts)");
        while(attempts<maxAttempts){
        System.out.print("enter your guess:");
        int userGuess=scanner.nextInt();
        attempts++;
        if(userGuess==randomnumber){
        System.out.println("congratulations! you guessed the number correctly in"+attempts+"attempts.");
        score++;
        guessedcorrectly=true;
        break;
       }else if(userGuess>randomnumber){
       System.out.println("too high! Try again.");
       }else{
       System.out.println("too low! Try again");
       }
       if(attempts==maxAttempts){
        System.out.println("sorry,you've used all your attempts.The correct number was:"+randomnumber);
       }
        }
        System.out.println("current score:"+score);
        System.out.println("do you want to play again?(yes/no):");
        String response=scanner.next().toLowerCase();
        playAgain=response.equals("yes");
    }
    System.out.println("game over! your final score is:"+score);
    scanner.close();
}
}