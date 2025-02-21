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
    public void testThatDiaryIsLockedWithIncorrectPassword_throwsIllegalArgumentException() {
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
        diary.createEntry( "eye", "nose");
        assertEquals(2, diary.entrySize());
        diary.createEntry( "fish", "i love proteins");
        assertEquals(3, diary.entrySize());
    }

    @Test
    public void testThatDiaryWouldNotDoAnyOperationWhenLocked_throwsIllegalStateException() {
        diary.lockDiary();
        assertThrows(IllegalStateException.class, () -> diary.createEntry("body", "body parts"));
    }


    @Test
    public void thatDiaryCanDeleteEntryAndReturnRemainingSize() {
        diary.lockDiary();
        diary.isUnlocked("password");
        diary.createEntry( "body", "body parts");
        diary.createEntry( "eye", "nose");
        diary.createEntry( "fish", "i love proteins");
        diary.deleteEntry(1);
        diary.deleteEntry(2);
        assertEquals(1, diary.entrySize());
    }

    @Test
    public void testThatDiaryWillNotDeleteEntryWithNoFoundId_ThrowsIllegalArgumentException() {
        diary.lockDiary();
        diary.isUnlocked("password");
        diary.createEntry("body", "body parts");
        diary.createEntry("eye", "nose");
        diary.createEntry("fish", "i love proteins");
        assertThrows(IllegalArgumentException.class, () -> diary.deleteEntry(4));
    }

    @Test
    public void testThatDiaryWouldFindAnEntryWithUniqueIdAndReturnEntry() {
        diary.lockDiary();
        diary.isUnlocked("password");
        diary.createEntry( "body", "body parts");
        diary.createEntry( "eye", "nose");

        Entry returnedEntry = diary.findEntryById(1);
        System.out.println(returnedEntry);
        String expected = "body parts";
        String actual = returnedEntry.getBody();
        assertEquals(expected, actual);
    }

    @Test
    public void testThatDiaryWouldFindAnEntryWithNoFoundId_ThrowsIllegalArgumentException() {
        diary.lockDiary();
        diary.isUnlocked("password");
        diary.createEntry("body", "body parts");
        diary.createEntry("eye", "nose");

        assertThrows(IllegalArgumentException.class, () -> diary.findEntryById(3));
    }

    @Test
    public void testThatDiaryCanUpdateEntry() {
        diary.lockDiary();
        diary.isUnlocked("password");
        diary.createEntry( "body", "body parts");
        diary.createEntry( "eye", "nose");
        assertEquals("body body parts", diary.findEntryById(1).toString());
        assertNotEquals("body body parts, i love my face", diary.findEntryById(1).toString());
        diary.updateEntry(1, "body", "body parts, i love my face");
        assertEquals("body body parts, i love my face", diary.findEntryById(1).toString());

    }
}
