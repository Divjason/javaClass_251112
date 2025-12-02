package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 클래스 > 프로토타입 > ****인스턴스
    void initMember(String name, int age, int grade) {
        // this 객체
        // this 생략? -> 왠만하면 생략 x
        // this객체를 생략하고 싶다면, 상단 선언한 변수명 & 메서드 함수 매개변수 반드시 달라야함
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
