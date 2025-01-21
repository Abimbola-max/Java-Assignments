public class AirConditioner {

    private boolean isOn;
    private int temperatureControl;
    private int maxTemperature;
    private int minTemperature;

    public AirConditioner() {
        isOn = true;
        temperatureControl = 16;
        maxTemperature = 30;
        minTemperature = 16;
    }

    public boolean airConditionerIsOn() {
        return true;
    }

    public boolean airConditionerIsOff() {
        return false;
    }

    public int getTemperatureControl() {
        return temperatureControl;
    }

    public int increasedTemperature() {
        if (isOn && temperatureControl < 30) {
            temperatureControl++;
        }
        return temperatureControl;
    }

    public int decreasedTemperature() {
        if (isOn && temperatureControl > 16) {
            temperatureControl--;
        }
        return temperatureControl;
    }


}