import Exceptions.InvalidCharacterException;
import Exceptions.InvalidUserIdException;

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
        if(value == null) throw new InvalidCharacterException("Value cannot be null");
        this.value = value;
    }
    public int setId(int id) {
        if (id <= 0 || id > 2) {
            throw new InvalidUserIdException("id must be a positive integer and between 0 and 2");
        }
        return this.id = id;
    }
}
