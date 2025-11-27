package ref;

public class VarChange1 {
    public static void main(String[] args) {
        /*
        *변수의 기본형 VS 참조형!!
        1. 기본형 타입 변수
        > 해당 변수 안에 다음과 같은 자료형태가 담겨있는 경우
        > int, double, boolean, long => 기본형!!
        > basic, default X
        > Primitive Type => 변수가 선언 -> 값이 입력 -> 변수, 해당 값을 기본적으로 사용!
         
        2. 참조형 타입 변수
        > 기본형이 아니면, 모두 참조형!!
        > 클래스, 배열
        > 참조형 타입 변수 -> 예외, String
        > 변수 -> 값이 입력 -> 해당 값을 출력하고 싶어도, 바로 출력 x
        > 컴퓨터 메모리 공간 어딘가 > 값이 저장되어있음 > 저장되어있는 값의 주소 참조
        > 참조형 타입 변수 할당
        > 참조형 타입 변수를 호출 > 메모리 공간 해당 값의 주소 호출 > 실제 값 출력
        */

        int a = 10, b = 20;
        int sum = a + b;

        System.out.println(sum);

        Student s1 = new Student();
        s1.grade = 100;
        Student s2 = new Student();
        s2.grade = 200;

        int sum01 = s1.grade + s2.grade;
        System.out.println(sum01);
    }
}
