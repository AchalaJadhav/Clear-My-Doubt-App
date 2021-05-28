package com.example.clearmydoubt;
public class QuestionAnswer {
    boolean status;
    String year;
    String branch;
    String subject;
    String question;
    String answer;

    QuestionAnswer()
    {

    }
    QuestionAnswer(String year,String branch,String subject,String question,String answer,boolean status){
        this.year=year;
        this.branch = branch;
        this.subject = subject;
        this.question = question;
        this.answer = answer;
        this.status = status;
    }

    public  void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean getStatus() {
        return status;
    }

    public String getAnswer() {
        return answer;
    }

    public String getBranch() {
        return branch;
    }

    public String getQuestion() {
        return question;
    }

    public String getSubject() {
        return subject;
    }

    public String getYear() {
        return year;
    }
}
