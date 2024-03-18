package ch15.sec02.exam01;

public class Board {
    private String content;
    private String subject;
    private String writer;

    public Board(String content, String subject, String writer) {
        this.content = content;
        this.subject = subject;
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", subject='" + subject + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
