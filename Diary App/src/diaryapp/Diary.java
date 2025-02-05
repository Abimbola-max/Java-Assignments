package diaryapp;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked;
    private final ArrayList<Entry> entries = new ArrayList<>();
    private int entryCount;

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

    public Entry createEntry(String title, String body) {
        if (isLocked) throw new IllegalStateException("Diary is locked. Cannot add entry.");
        int id = generateId();
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
        return newEntry;
    }

    public int generateId() {
       return ++entryCount;
    }

    public int entrySize() {
        return entries.size();
    }

    public void deleteEntry(int id) {
        if (isLocked) throw new IllegalStateException("Diary is locked. Cannot delete entry.");
        boolean removed = false;
        int removeIndex = 0;
        while (removeIndex < entries.size()) {
            if (entries.get(removeIndex).getId() == id) {
                entries.remove(removeIndex);
                removed = true;
            } else {
                removeIndex++;
            }
        }
        if (!removed) throw new IllegalArgumentException("Entry with id " + id + " not found.");
    }

    public Entry findEntryById(int id) {
        if (isLocked) throw new IllegalStateException("Diary is locked. Cannot find entry.");
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        } throw new IllegalArgumentException("Entry with id " + id + " not found.");
    }

    public void updateEntry(int id, String title, String body) {
        if (isLocked) throw new IllegalStateException("Diary is locked. Cannot update entry.");

        Entry entryToUpdate = findEntryById(id);
        entryToUpdate.setTitle(title);
        entryToUpdate.setBody(body);
    }

    public String toString() {
        return "Diary: userName=" + userName + ", password=" + password;
    }

    public String viewEntries(String userName, String password) {
        if (isLocked) throw new IllegalStateException("Diary is locked. Cannot view entries.");
        if (userName == null || password == null) throw new NullPointerException();

        String output = "";
        for (Entry entry : entries) {
            output += entry.toString() + "\n";
        }
        return output;
    }
}
