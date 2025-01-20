import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeApplicationTest {

    @Test
    public void testClassSummary() {
        double[] totalScores = {85.5, 70.0, 92.0, 65.0, 98.0};
        double[] averages = {85.5, 70.0, 92.0, 65.0, 98.0};
        String[] names = {"John", "Jane", "David", "Emily", "Sophia"};

        double expectedBestGraduatingStudent = 196.0;
        String expectedHighestStudent = "Sophia";
        double expectedWorstGraduatingStudent = 130.0;
        String expectedLowestStudent = "Emily";
        double expectedClassTotalScore = 410.5;

        StudentGradeApplication.classSummary(totalScores, averages, names);

        assertEquals(expectedBestGraduatingStudent, expectedBestGraduatingStudent);
        assertEquals(expectedWorstGraduatingStudent, expectedWorstGraduatingStudent);
        assertEquals(expectedClassTotalScore, expectedClassTotalScore);

    }

    @Test
    public void subjectSummaryTest() {
        double[][] scores = {
                            {85.5, 70.0, 92.0},
                            {65.0, 98.0, 67.0},
        };

        int expectedHighestScoringStudent1 = 2;
        double expectedHighestStudentScore1 = 90.0;
        int expectedLowestScoringStudent1 = 1;
        double expectedLowestStudentScore1 = 65.0;
        double expectedTotalScore1 = 240.0;
        double expectedAverageScore1 = 80.0;
        int expectedNumberOfPasses1 = 3;
        int expectedNumberOfFails1 = 0;

        int expectedHighestScoringStudent2 = 1;
        double expectedHighestStudentScore2 = 98.0;
        int expectedLowestScoringStudent2 = 0;
        double expectedLowestStudentScore2 = 70.0;
        double expectedTotalScore2 = 240.0;
        double expectedAverageScore2 = 80.0;
        int expectedNumberOfPasses2 = 3;
        int expectedNumberOfFails2 = 0;

        StudentGradeApplication.subjectSummary(scores);
        assertEquals(expectedHighestScoringStudent1, expectedHighestScoringStudent1);
        assertEquals(expectedHighestStudentScore1, expectedHighestStudentScore1);

    }
}
