package Spring01;

public class Bus extends Transportation{
    // 요금
    private int price;
    // 버스 번호
    private String busNumber;

    public Bus(int currentPassenger, String busNumber) {
        super(currentPassenger);
        this.price = 1000;
        this.busNumber = busNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    //상태 변경하는 메서드
    @Override
    public void StopIsDriving() {
        if (getIsDriving() != "운행") {
            System.out.println("차고지로 갑니다");
            setIsDriving("차고지");
        }
        else {
            System.out.println("운행합니다");
            setIsDriving("운행");
        }
    }
}