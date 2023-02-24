package Spring01;

abstract public class Transportation implements TransportationFunction{
    // 최대승객수
    private int maxPassenger;
    // 현재 승객수
    private int currentPassenger;
    // 주유량
    private int fuel;
    // 현재속도
    private int currentSpeed;
    // 상태
    private String isDriving;

    public Transportation(int currentPassenger) {
        this.maxPassenger = 30;
        this.currentPassenger = currentPassenger;
        this.fuel = 100;
        this.currentSpeed = 0;
        this.isDriving = "운행";
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getIsDriving() {
        return isDriving;
    }

    public void setIsDriving(String isDriving) {
        this.isDriving = isDriving;
    }

    @Override
    public void GoIsDriving() {

    }

    @Override
    abstract public void StopIsDriving();

    @Override
    public void Passenger(int passenger) {
        if (getIsDriving() != "운행") {
            System.out.println("운행 안함!");
            return;
        }
        System.out.println();
        setCurrentPassenger(getCurrentPassenger() + passenger);
        System.out.println(passenger + "명 탔다!");
    }

    @Override
    public void ChangeSpeed() {

    }
}
