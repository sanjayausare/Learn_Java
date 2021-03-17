class Player{
    int guessedNumber;

    void guessIt() {
        guessedNumber = (int)(Math.random()*10);
        System.out.println("I guess the Number is "+guessedNumber);
    }
}

class GuessGame{

    void play()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
    
        int actualNumber = (int)(Math.random()*10);
    
        System.out.println("I have Thought of a Number.\nLet's start the Game!");

        while(true)
        {
            System.out.println("Player1?");
            p1.guessIt();
            if(p1.guessedNumber == actualNumber)
            {
                System.out.println("Player1 has got it!\nGame Over.");
                break;
            }
            else
            {
                System.out.println("Unfortunately that's incorrect.");
            }
            System.out.println("Player2?");
            p2.guessIt();
            if(p2.guessedNumber == actualNumber)
            {
                System.out.println("Player2 has got it!\nGame Over.");
                break;
            }
            else
            {
                System.out.println("Unfortunately that's incorrect.");
            }
            System.out.println("Player3?");
            p3.guessIt();
            if(p3.guessedNumber == actualNumber)
            {
                System.out.println("Player3 has got it!\nGame Over.");
                break;
            }
            else
            {
                System.out.println("Unfortunately that's incorrect.");
            }
            System.out.println("Since no one got it right in the round, let's try again.");
        }

    }

}

public class TheGuessingGame {
    
    public static void main(String args[])
    {
        GuessGame game = new GuessGame();
        game.play();
    }
}