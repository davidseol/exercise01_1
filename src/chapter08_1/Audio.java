package chapter08_1;

public class Audio implements RemoteControl1 {

    private int volume;

    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    public void setVolume(int volume) {
        if(volume>RemoteControl1.MAX_VOLUME) {
            this.volume = RemoteControl1.MAX_VOLUME;
        } else if(volume<RemoteControl1.MIN_VOLUME) {
            this.volume = RemoteControl1.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}
