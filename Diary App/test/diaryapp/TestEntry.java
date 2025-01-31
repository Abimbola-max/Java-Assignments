package diaryapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEntry {

    @Test
    public void testThatMyDiaryIsEmpty() {
        Entry entry = new Entry(0, "", "");
        assertTrue(entry.isEmpty());
    }
}
