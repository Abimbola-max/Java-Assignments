import java.util.ArrayList;

public class Diary {
    private String name;
    private int pin;
    private boolean isLocked;
    private ArrayList<Entry> diaryEntries = new ArrayList<>();

    public void createDiary(String name, int pin) {
        this.name = name;
        this.pin = pin;
        isLocked = true;
    }

    public void lockDiary(int pin) {
        if (this.pin == pin) {
            this.isLocked = true;
        }
    }

    public void unlockDiary(int pin) {
        if (this.pin == pin) {
            this.isLocked = false;
        }
    }

    public void updateEntry(int id, String title, String body) {
        if (isLocked) {
            throw new IllegalStateException("Diary is locked. Cannot update entry.");
        }
        Entry entryToUpdate = findEntryById(id);
        entryToUpdate.setTitle(title);
        entryToUpdate.setBody(body);
    }


    public void deleteEntry(int pin, Entry entry) {
        if (isLocked) {
            throw new IllegalStateException("Diary is locked. Cannot delete entry.");
        }
        if (this.pin == pin) {
            this.diaryEntries.remove(entry);
        }
    }

    public Entry findEntryById(int id) {
        if (isLocked) {
            throw new IllegalStateException("Diary is locked. Cannot search for entry.");
        }
        for (Entry entry : diaryEntries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        throw new IllegalArgumentException("Entry with id " + id + " not found.") ;
    }

    public void addEntry(String title, String body, int id) {
        Entry entry = new Entry(title, body, id);
        entry.setTitle(title);
        entry.setBody(body);
        entry.setId(id);
        diaryEntries.add(entry);
    }

}
