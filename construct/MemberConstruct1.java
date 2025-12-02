package construct;

public class MemberConstruct1 {
    String name;
    int age;
    int grade;

    MemberConstruct1(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }

    MemberConstruct1(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
