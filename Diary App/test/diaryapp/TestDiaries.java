package diaryapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDiaries {

    @Test
    public void testThatDiariesCanAddTitleAndBody() {
        Diaries diaries = new Diaries();
        diaries.add("username", "title");
    }

    @Test
    public void testThatDiariesCanFindByUsername() {
        Diaries diaries = new Diaries();
        diaries.add("title", "body");
        assertEquals("title body", diaries.findByUserName("bimbola"));
    }
}

