package biketask;

public class BikeTask {

    private int currentGear;
    private int currentSpeed;

    public BikeTask(int currentGear, int currentSpeed) {
        this.currentGear = currentGear;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }
    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isTurnedOn() {
        return true;
    }

    public boolean isTurnedOff() {
        return false;
    }

    public int accerelator() {
        switch (currentGear) {
            case 1:
                currentSpeed += 1;
                break;
            case 2:
               currentSpeed += 2;
               break;
            case 3:
                currentSpeed += 3;
                break;
            case 4:
                currentSpeed += 4;
                break;
            default:
                break;
        }
        return currentSpeed;
    }

    public int decelerate() {
        switch (currentGear) {
            case 1:
                currentSpeed -= 1;
                break;
            case 2:
                currentSpeed -= 2;
                break;
            case 3:
                currentSpeed -= 3;
                break;
            case 4:
                currentSpeed -= 4;
                break;
            default:
                break;
        }
        return currentSpeed;
    }

    public void setGear() {
        if (currentSpeed >= 0 && currentSpeed <= 20) currentGear = 1;
    }
}