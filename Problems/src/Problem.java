public class Problem {

    private String ProblemName;
    private String type;
    private boolean isSolved;

    public Problem(String name, String type) {
        this.ProblemName = name;
        this.type = type;
        this.isSolved = false;

    }

    public String getProblemName() {
        return ProblemName;
    }
    public String getType() {
        return type;
    }
    public void setName() {
        this.ProblemName = ProblemName;
    }


}