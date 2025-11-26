package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        // 어떤 학생의 정보값을 저장!!
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.printf("이름 : %s, 나이 : %d, 성적 : %d\n", student1Name, student1Age, student1Grade);
        System.out.printf("이름 : %s, 나이 : %d, 성적 : %d\n", student2Name, student2Age, student2Grade);

        // 학생이 추가될 때마다 4개 문장의 코드가 추가!
        // 10명이 추가 -> 40문장 추가
        // 반복문 + 배열
    }
}
