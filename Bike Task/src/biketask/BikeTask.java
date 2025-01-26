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

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isTurnedOn() {
        return true;
    }

    public boolean isTurnedOff() {
        return false;
    }

    public int accerelate() {
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
                System.out.println("Invalid gear");
                break;
        }
        setGear();
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
                System.out.println("Invalid gear");
                break;
        }
       setGear();
        return currentSpeed;
    }

    public void setGear() {
        if (currentSpeed >= 0 && currentSpeed <= 20) {
            currentGear = 1;
        } else if (currentSpeed >= 21 && currentSpeed <= 30) {
            currentGear = 2;
        } else if (currentSpeed >= 31 && currentSpeed <= 40) {
            currentGear = 3;
        } else {
            currentGear = 4;
        }
    }
}