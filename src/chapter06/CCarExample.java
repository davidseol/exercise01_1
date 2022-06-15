package chapter06;

import java.sql.SQLOutput;

public class CCarExample {
    public static void main(String[] args) {
        CCar car1 = new CCar();
        System.out.println("car1.company: " + car1.company);
        System.out.println();

        CCar car2 = new CCar("자가용");
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.model: " + car2.model);
        System.out.println();

        CCar car3 = new CCar("자가용", "빨강");
        System.out.println("car3.company: " + car3.company);
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.color: " + car3.color);
        System.out.println();

        CCar car4 = new CCar("택시", "검정", 200);
        System.out.println("car4.company: " + car4.company);
        System.out.println("car4.model: " + car4.model);
        System.out.println("car4.color: " + car4.color);
        System.out.println("car4.maxSpeed: " + car4.maxSpeed);
    }
}
