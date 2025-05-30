import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMorningTask {

    MorningTask morningTask = new MorningTask();

    @Test
    public void findMissingTask() {
        String number = "6,7,8,10";
        int answer = 9;
        int result = morningTask.findNumber(number);
        assertEquals(answer, result);
    }

    @Test
    public void findMissingTask2() {
        String number = "1,2,3,4,6,7";
        int answer = 5;
        int result = morningTask.findNumber(number);
        assertEquals(answer, result);
    }

    @Test
    public void findMissingTask3() {
        String number = "0,5";
        int answer = 10;
        int result = morningTask.findNumber(number);
        assertEquals(answer, result);
    }
}
