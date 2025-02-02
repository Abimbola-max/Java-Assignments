package diaryapp;

import java.util.ArrayList;

public class Diaries {

    private final ArrayList<Diary> diaries = new ArrayList<>();

    public void add(String username, String password) {
        Diary myDiary = new Diary(username, password);
        diaries.add(myDiary);
    }

    public Diary findByUserName(String userName) {
        for (Diary diary : diaries) {
            if (diary.getUserName().equals(userName)) {
                return diary;
            }
        } return null;
    }

    public int numberOfDiaries() {
        return diaries.size();
    }

    public void delete(String username, String password) {
        for (int index = 0; index < diaries.size(); index++) {
            Diary diary = diaries.get(index);
            if (diary.getUserName().equals(username) && diary.getPassword().equals(password)) {
                diaries.remove(index);
                index--;
            }
        }
    }
}
