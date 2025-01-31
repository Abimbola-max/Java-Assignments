package diaryapp;

import java.util.ArrayList;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked;
    private final ArrayList<Entry> entries = new ArrayList<>();

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
        if (passwordValidation(password)) {
            this.isLocked = false;
            return true;
        };
        return false;
    }

    private boolean passwordValidation(String password) {
        if (password.equals(this.password)) return true;
        else throw new IllegalArgumentException("Passwords do not match");
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public void createEntry(String title, String body) {
        if (isLocked) throw new IllegalStateException("Diary is locked. Cannot add entry.");
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
    }

    private v
}
