package chapter08_1;

public class MyClass {
    RemoteControl1 rc = new Television();

    MyClass() {
    }

    MyClass(RemoteControl1 rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodA() {
        RemoteControl1 rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }
    void methodB(RemoteControl1 rc) {
        rc.turnOn();
        rc.setVolume(5);
    }
}
