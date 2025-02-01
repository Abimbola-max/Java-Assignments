package diaryapp;

import java.util.ArrayList;

public class Diaries {

    private final ArrayList<Diary> diaries = new ArrayList<>();


    public void add(String title, String body) {
        diaries.add(new Diary(title, body));
    }

    public Diary findByUserName(String userName) {
        for (Diary diary : diaries) {
            if (diary.getUserName().equals(userName)) {
                return diary;
            }
        } return null;
    }
}
