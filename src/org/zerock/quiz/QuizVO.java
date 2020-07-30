package org.zerock.quiz;

public class QuizVO {

    String question;
    String optionStr;
    int answer;

    public QuizVO(String question, String optionStr, int answer) {
        this.question = question;
        this.optionStr = optionStr;
        this.answer = answer;
    }

    public boolean checkAnswer(int userAnswer){

        return this.answer == userAnswer;
    }

    @Override
    public String toString() {
        return "QuizVO{" +
                "question='" + question + '\'' +
                ", optionStr='" + optionStr + '\'' +
                ", answer=" + answer +
                '}';
    }

    public String getQuestion() {
        return this.question;
    }

    public String getOptions() {
        return this.optionStr;
    }
}
