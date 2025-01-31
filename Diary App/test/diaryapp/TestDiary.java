package diaryapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDiary {

    @Test
    public void testThatDiaryIsCreated() {
        Diary diary = new Diary("abimbola", "password");
        assertEquals("abimbola", diary.getUserName());
        assertEquals("password", diary.getPassword());
    }
}
