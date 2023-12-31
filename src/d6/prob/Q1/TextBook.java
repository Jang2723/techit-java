package d6.prob.Q1;

import org.w3c.dom.Text;

// TextBook 클래스는 과목, 학년에 대한 정보를 가지고 있다.
public class TextBook extends Book{
    private String subject;
    private int grade;

    public TextBook(String title, int pages, String subject, int grade){
        super(title,pages);
        this.subject = subject;
        this.grade = grade;
    }

    @Override
    public void printInfo(){
        System.out.println(String.format("title : %s", getTitle()));
        System.out.println(String.format("pages : %d", getPages()));
        System.out.println(String.format("grade : %d",grade));
        System.out.println(String.format("subject : %s",subject));
    }
}
