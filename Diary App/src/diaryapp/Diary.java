package diaryapp;

import java.util.ArrayList;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password) {
        if (userName == null || password == null) throw new NullPointerException();
        this.userName = userName;
        this.password = password;
        this.isLocked = true;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean isUnlocked(String password) {
        if (this.password.equals(password) && this.isLocked) return true;
        return false;
    }
}
