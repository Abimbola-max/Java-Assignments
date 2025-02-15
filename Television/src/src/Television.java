package src;

public class Television {

    private int volumeLevel;
    private int channelLevel;
    private boolean isOn;

    public Television() {
        volumeLevel = 0;
        channelLevel = 0;
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isTurnedOn() {
        isOn = !isOn;
        return isOn;
    }
}
