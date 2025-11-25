package method;

public class Method3 {
    public static void main(String[] args) {
        // JVM, JDK -> Java 작성코드 -> 운영체제 -> 일관 실행
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printfooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");
        return;
    }

    public static void printfooter() {
        System.out.println("= 프로그램을 종료합니다. =");
    }

//    public static int add() {
//        public : 접근 제어자 = access modifier
//        - public(누구든지 & 어디에서든 함수호출 허용)
//        - private(특정 클래스 에서만 함수호출 허용)
//        - protected(특수한 상황 = 함수를 선언한 클래스의 값을 상속받은 클래스에서만 함수호출 허용)
//
//        static : 정적이다
//        - 원칙적으로 클래스 내부에서 선언된 함수는 그냥 바로 호출 x
//        - 클래스 -> 인스턴스 객체를 통해서만 함수 사용
//    }

//    public int add() {
//
//    }
    // Method3 util = new Method3();
    // util.add()
}
