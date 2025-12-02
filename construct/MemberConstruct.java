package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    
    // 생성자 함수
    // 대원칙 : 클래스명과 동일!!!
    // 애초에 클래스를 활용해서 인스턴스 객체를 생성할 때, 별도의 메서드 함수 등을
    // 활용해서 인스턴스 객체의 값을 할당하지 않고, 그냥, 프로토타입 객체를 선언할 때,
    // 바로 인자값을 받아서 인스턴스 객체 내 값을 할당!!!
    MemberConstruct(String name, int age, int grade) {
        System.out.printf("생성자 호출 name = %s, age = %d, grade = %d\n", name, age, grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
