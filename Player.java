import java.util.*;

public class Player 
{
    private String first, last;
    private int score = 0;

    public Player(String firstIn, String lastIn)
    {
        this.first = firstIn;
        this.last = lastIn;
    }
    public String getFirstName()
    {
        return this.first;
    }
    public String getLastName()
    {
        return this.last;
    }
    public void updatePlayerScore(int points)
    {
        this.score += points;
    }
    public int getScore()
    {
        return this.score;
    }
    public String toString()
    {
        return this.first + " " + this.last + ", your game is over!\n Your final score is " + this.getScore() + " Points!";
    }
}
