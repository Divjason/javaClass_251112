package access;

import javax.swing.plaf.synth.SynthUI;

public class Speaker {
    // 어떤 스피커에 들어가는 소프트웨어 프로그램 개발.
    // 스피커 > 기능 > 음량조절
    // 스피커 치명적인 단점
    // 음량이 100을 초과하는 순간 스피커가 터짐

    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
