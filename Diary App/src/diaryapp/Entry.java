package diaryapp;

import java.time.LocalDateTime;

public class Entry {

    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public void setLocalDateTime() {
        dateCreated = LocalDateTime.now();
        }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public String toString() {
        return title + " " + body;
    }
}
