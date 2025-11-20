package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // 명시적 형변환
        // 다운캐스팅 => 명시적 형변환 => 원래값 변화!
        // intValue = doubleValue;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
