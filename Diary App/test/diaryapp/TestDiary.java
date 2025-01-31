package diaryapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDiary {

    @Test
    public void testThatDiaryIsCreated() {
        Diary diary = new Diary("abimbola", "password");
        assertEquals("abimbola", diary.getUserName());
        assertEquals("password", diary.getPassword());
    }

    @Test
    public void testThatUserNameFieldCannotBeEmpty() {
        assertThrows(NullPointerException.class, () -> new Diary(null, "password"));
    }
}
