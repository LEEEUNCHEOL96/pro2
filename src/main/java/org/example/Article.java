package org.example;

public class Article {
    private int id;
    private String subject;
    private String content;
    //필드 id,subject,content 초기화

    Article(int id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
    }
    //생성자함수


    public int getId () {
        return this.id;
    }
    public String getSubject () {
        return this.subject;
    }
    public String getContent () {
        return this.content;
    }

}
// private 필드를 가져오기 위해 getter을 만든다.