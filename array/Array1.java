package array;

public class Array1 {
    public static void main(String[] args) {
        // 변수 => 값을 담기위한 목적
        // 1 : 1
        // 신상정보, 책정보 => 책제목, 저자명, 페이지수, 판매가, 출판사, 줄거리
        //
//        String booktitle = "A";
//        String author = "B";
//        int bookpage = 248;
//        int price = 20000;
//        String publisher = "C";
//        String info = "D";

//        int[] students; // 배열선언!
//        students = new int[] {90, 80, 70, 60, 50}; // 5개의 정수값을 받을 수 있도록 배열생성!

        int[] students = {90, 80, 70, 60, 50};

        // 배열 iterable => 반복할 수 있는~
        // 배열안에 있는 각각의 값들이 고유한 순번을 가지고 있어야한다.
        // 각각의 값들에 부여된 고유한 순번 => index(인덱스)
        // 이진수 (이진법) => 순번의 시작은 반드시 0번부터 시작
        // 배열안에 있는 전체 총 아이템의 개수 - 1 : 반드시 배열의 마지막번째 인덱스값
        // 반복문 케미 => 배열

//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

//        System.out.println("학생 1점수 : " + students[0]);
//        System.out.println("학생 2점수 : " + students[1]);
//        System.out.println("학생 3점수 : " + students[2]);
//        System.out.println("학생 4점수 : " + students[3]);
//        System.out.println("학생 5점수 : " + students[4]);

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 " + (i + 1) + " 점수 " + students[i]);
        }
    }
}
