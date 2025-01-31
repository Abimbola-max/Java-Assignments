package diaryapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDiary {

    private Diary diary;

    @BeforeEach
    public void startWithThis() {
        diary = new Diary("abimbola", "password");
    }

    @Test
    public void testThatDiaryIsCreated() {
        assertEquals("abimbola", diary.getUserName());
        assertEquals("password", diary.getPassword());
    }

    @Test
    public void testThatUserNameFieldCannotBeEmpty() {
        assertThrows(NullPointerException.class, () -> new Diary(null, "password"));
    }

    @Test
    public void testThatPasswordFieldCannotBeEmpty() {
        assertThrows(NullPointerException.class, () -> new Diary("abimbola", null));
    }

    @Test
    public void testThatDiaryIsUnlockedWithCorrectPassword() {
        diary.lockDiary();
        assertTrue(diary.isUnlocked("password"));
    }

    @Test
    public void testThatDiaryIsLockedWithIncorrectPassword() {
        diary.lockDiary();
        assertThrows(IllegalArgumentException.class, () -> diary.isUnlocked("passwo"));
        assertThrows(IllegalArgumentException.class, () -> diary.isUnlocked("pass word"));
    }

    @Test
    public void thatDiaryCanCreateEntry() {
        diary.lockDiary();
        diary.isUnlocked("password");
        diary.createEntry( "body", "body parts");
        assertEquals(1, diary.entrySize());
    }

}
