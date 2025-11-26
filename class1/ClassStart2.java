package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("이름 : %s, 나이 : %d, 성적 : %d\n", studentNames[i], studentAges[i], studentGrades[i]);
        }
    }
}
