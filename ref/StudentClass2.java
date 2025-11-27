package ref;

public class StudentClass2 {
    public static void main(String[] args) {
        Student01 student1 = new Student01();
        initStudent(student1, "학생1", 15, 90);

        Student01 student2 = new Student01();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    public static void initStudent(Student01 student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    public static void printStudent(Student01 student) {
        System.out.printf("이름 : %s, 나이 : %d, 성적 : %d\n", student.name, student.age, student.grade);
    }
}
