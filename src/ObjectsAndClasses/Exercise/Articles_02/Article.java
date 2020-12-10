package ObjectsAndClasses.Exercise.Articles_02;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article (String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getContent (){
        return content;
    }
    public void edit (String content) {
        this.content = content;;
    }

    public String getAuthor() {
        return author;
    }

    public void changeAuthor (String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void rename (String title) {
        this.title = title;
    }

    @Override
    public String toString () { // override method .toString;
        String result = String.format("%s - %s: %s", this.title, this.content, this.author);
        return result;
    }
}