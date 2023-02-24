package Spring01;

public class BusClass {
    public static void main(String[] args) {
        TransportationFunction busTest = new Bus(0, "100");
        ((Transportation) busTest).getCurrentPassenger();
        int num1 = 3;
        int num2 = 2;
        double num3 = (double) num1/num2 *1000;
        System.out.println(num3);
    }
}
