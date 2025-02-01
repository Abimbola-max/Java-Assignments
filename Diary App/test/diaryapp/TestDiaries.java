package diaryapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestDiaries {

    @Test
    public void testThatDiariesCanAddTitleAndBody() {
        Diaries diaries = new Diaries();
        diaries.add("username", "password");
        diaries.add("username1", "password1");
        assertEquals(2, diaries.numberOfDiaries());
    }

    @Test
    public void testThatDiariesCanFindByUsername() {
        Diaries diaries = new Diaries();
        diaries.add("username", "password");
        Diary find = diaries.findByUserName("username");
        assertEquals("username", find.getUserName());
    }

    @Test
    public void testThatDiariesCanDeleteDetails() {
        Diaries diaries = new Diaries();
        diaries.add("username", "password");
        diaries.add("username1", "password1");
        diaries.add("username2", "password2");

        diaries.delete("username2", "password2");
        assertEquals(2, diaries.numberOfDiaries());
    }
}

