package chapter08_1;

public interface RemoteControl1 {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
