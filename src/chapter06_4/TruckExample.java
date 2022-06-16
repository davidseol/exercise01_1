package chapter06_4;

public class TruckExample {
    public static void main(String[] args) {
        Truck myTruck = new Truck();

        myTruck.setGas(5);

        boolean gasState = myTruck.isLeftGas();
        if(gasState) {
            System.out.println("출발합니다.");
            myTruck.run();
        }

        if(myTruck.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
}
