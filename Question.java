import java.util.*;

public abstract class Question 
{
    private String question;
    private int questionPoints;

    public Question(){}

    public Question(String questionIn, int questionPointsIn)
    {
        this.question = questionIn;
        this.questionPoints = questionPointsIn;
    }
    public String getQuestion()
    {
        return this.question;
    }
    public void setQuestion(String input)
    {
        this.question = input;
    }
    public int getPoints()
    {
        return this.questionPoints;
    }
    public void setPoints(int input)
    {
        this.questionPoints = input;
    }
    public String toString()
    {
        return "Points: " + this.questionPoints + "\nQuestion: " + this.question; 
    }
    public abstract String getAnswer();
}
