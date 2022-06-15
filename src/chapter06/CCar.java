package chapter06;

public class CCar {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    CCar() {
    }

    CCar(String model) {
        this(model, "은색", 250);
    }
    CCar(String model, String color) {
        this(model, color, 250);
    }
    CCar(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
