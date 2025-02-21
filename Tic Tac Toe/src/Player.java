public class Player {

    private int id;
    private Value value;

    public Player(int id, Value value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }
    public Value getValue() {
        return value;
    }
    public void setValue(Value value) {
        this.value = value;
    }
    public int setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("id must be a positive integer");
        }
        return this.id = id;
    }
}
