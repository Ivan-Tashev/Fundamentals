package ObjectsAndClasses.Exercise.AdvertisementMessage_01;

public class Adv {
    private String phrase;
    private String event;
    private String author;
    private String city;

    public Adv(String phrase, String event, String author, String city) {
        this.phrase = phrase;
        this.event = event;
        this.author = author;
        this.city = city;
    }

    public String getPhrase() {
        return phrase;
    }
    public void setPhrase() {
        this.phrase = phrase;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor() {
        this.author = author;
    }

    public String getEvent() {
        return event;
    }
    public void setEvent() {
        this.event = event;
    }

    public String getCity() {
        return city;
    }
    public void setCity() {
        this.city = city;
    }

    public String printAdvert(String p, String e, String n, String c){
        return String.format("%s %s %s - %s",
                this.getPhrase(),
                this.getEvent(),
                this.getAuthor(),
                this.getCity());
    }
}
