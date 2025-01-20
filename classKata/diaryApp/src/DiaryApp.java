public class DiaryApp {

    private String name;
    private int pin;

    public DiaryApp(String name, int pin) {
        this.name = name;
        this.pin = pin;
    }
    

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
    }

}