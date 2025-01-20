public class Entry {

    private int id;
    private String title;
    private String body;

    public Entry() {
        this.id = id;
        this.title = title;
        this.body = body;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getBody() {
        return body;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
