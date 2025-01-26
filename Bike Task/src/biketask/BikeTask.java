package biketask;

public class BikeTask {

    private int currentGear;
    private int currentSpeed;
    private boolean isOn = true;
    private boolean isOff = false;


    public BikeTask() {
        this.currentGear = 0;
        this.currentSpeed = 0;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public boolean isTurnedOn() {
        return isOn;
    }

    public boolean isTurnedOff() {
        return isOff;
    }

    public int accerelate() {
        switch (currentGear) {
            case 1:
                this.currentSpeed += 1;
                break;
            case 2:
               this.currentSpeed += 2;
               break;
            case 3:
                this.currentSpeed += 3;
                break;
            case 4:
                this.currentSpeed += 4;
                break;
            default:
                break;
        }
        setGear();
        return this.currentSpeed;
    }

    public int decelerate() {
        switch (currentGear) {
            case 1:
                this.currentSpeed -= 1;
                break;
            case 2:
                this.currentSpeed -= 2;
                break;
            case 3:
                this.currentSpeed -= 3;
                break;
            case 4:
                this.currentSpeed -= 4;
                break;
            default:
                break;
        }
       setGear();
        return this.currentSpeed;
    }

    public int setGear() {
        if (this.currentSpeed >= 0 && this.currentSpeed <= 20) {
            currentGear = 1;
        } else if (this.currentSpeed >= 21 && this.currentSpeed <= 30) {
            currentGear = 2;
        } else if (this.currentSpeed >= 31 && this.currentSpeed <= 40) {
            currentGear = 3;
        } else {
            currentGear = 4;
        }
        return currentGear;
    }
}