package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // 문제 -> 해결 -> 새로운 문법 / 알고리즘 / 자료구조
        // 학생의 정보 형태 동일 -> 이름, 나이, 점수
        // 애초에 학생의 정보 형태를 일정하게 간직할 수 있는 하나의 틀
        // 틀 <- 값만 넣어준다면, 언제라도 학생의 정보 마치 붕어빵 탄생!!
        // 클래스 (틀) => 프로토타입 (샘플) => 인스턴스 (복제본)
        // 정수, 실수, 논리형, 문자열

        /*
        객체지향 프로그래밍 언어 -> Java
        절차지향 프로그래밍 언어 -> C
        
        냉장고에 코끼리를 넣는 방법

        > 1. 냉장고에 문을 연다.
        > 2. 코끼리를 냉장고에 넣는다.
        > 3. 냉장고에 문을 닫는다.

        > 1. 냉장고라는 클래스를 선언한다
        > 2. 냉장고라는 클래스를 선언할 때, 냉장고의 크기, 온도, 문의 위치를 사전에 세팅한다
        > 3. 코끼리라는 클래스를 선언한다
        > 4. 코끼리라는 클래스를 선언할 때, 코끼리의 크기, 코의 길이, 몸무게 등의 코끼리 정보를 사전에 세팅한다
        > 5. 코끼리가 냉장고 앞에 도착하면, 자신의 코를 통해서 냉장고 문을 열수 있도록 메서드를 사전에 만들어놓는다
        > 6. 코끼리가 냉장고 안에 다 들어가면 자신의 코를 통해서 냉장고 문을 닫을 수 있도록 메서드를 사전에 만들어놓는다.
        > 7. 코끼리클래스를 활용해서 코끼리 1 이라는 인스턴스를 생성한다
        > 8. 코끼리 1 이라는 인스턴스가 냉장고에 들어갈 수 있도록 안내한다

        */

        Student student1;
        student1 = new Student(); // Student 클래스 선언
        student1.name = "학생1"; // 온점 표기법 -> 할당
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // Student 클래스 선언
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student student3 = new Student(); // Student 클래스 선언
        student3.name = "학생2";
        student3.age = 16;
        student3.grade = 80;

        System.out.printf("이름 : %s, 나이 : %d, 성적 : %d\n", student1.name, student1.age, student1.grade);
        System.out.printf("이름 : %s, 나이 : %d, 성적 : %d\n", student2.name, student2.age, student2.grade);

        System.out.println(student1);
        System.out.println(student2);
    }
}
