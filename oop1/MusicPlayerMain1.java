package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        // 뮤직 플레이어가 있다는 전제하에 플레이어 속성 코드 작성
        // 전원, 음향조절 등
        // PP = Procedure Programming
        // 아래 코드는 절차지향 프로그래밍 언어의 처리 방식
        // How = "어떻게" 에 관심이 많음!!
        // 절차지향 프로그래밍 언어 => 절차상의 어떻게 관심 많음!!
        
        // 뮤직 플레이어 전원 켜고, 끌 수 있는 장치
        boolean isOn = false;
        int volume = 0;
        
        // 뮤직 플레이어 전원 켜기
        isOn = true;
        System.out.println("뮤직 플레이어를 시작합니다.");

        // 뮤직 플레이어 볼륨 증가
        volume++;
        System.out.println("뮤직 플레이어 볼륨 : " + volume);

        // 뮤직 플레이어 볼륨 감소
        volume--;
        System.out.println("뮤직 플레이어 볼륨 : " + volume);
        
        // 뮤직 플레이어 상태
        System.out.println("뮤직 플레이어 상태 확인");
        if (isOn) {
            System.out.println("뮤직 플레이어 On, 볼륨 : " + volume);
        } else {
            System.out.println("뮤직 플레이어 Off");
        }

        // 뮤직 플레이어 전원 끄기
        isOn = false;
        System.out.println("뮤직 플레이어를 종료합니다.");
    }
}
