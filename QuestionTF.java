import java.util.*;

public final class QuestionTF extends Question
{
    private String answer;

    public QuestionTF(String questionIn, int pointsIn, String answerIn)
    {
        super.setQuestion(questionIn);
        super.setPoints(pointsIn);
        this.answer = answerIn;
    }
    public String getAnswer()
    {
        return this.answer;
    }    
    
}
