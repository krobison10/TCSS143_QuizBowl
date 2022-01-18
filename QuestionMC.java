import java.util.*;

public final class QuestionMC extends Question
{
    private String answer;
    private ArrayList<String> choiceArray = new ArrayList<String>();

    public QuestionMC(String questionIn, int pointsIn, ArrayList<String> choices, String answerIn)
    {
        super.setQuestion(questionIn);
        super.setPoints(pointsIn);
        this.answer = answerIn;
    }
    public String getAnswer()
    {
        return this.answer;
    }   
    public String toString()
    {
        String multiplechoiceOutput = "";
        for(int i = 0; i < choiceArray.size(); i++)
        {
            multiplechoiceOutput = multiplechoiceOutput + "\n" + choiceArray.get(i);
        }
        return "Points: " + super.getPoints() + "\n" + super.getQuestion() + multiplechoiceOutput;
    } 
}
