package chapter08_1;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl1 rc = tv;
        Searchable searchable = tv;
    }
}
