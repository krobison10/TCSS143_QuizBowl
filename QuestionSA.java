import java.util.*;

public final class QuestionSA extends Question
{
    private String answer;

    public QuestionSA(String questionIn, int pointsIn, String answerIn)
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
