package operator;

public class Operator9 {
    public static void main(String[] args) {
        /*
        사주팔자, 별자리, 운세
        문법 x, 만들고 싶은것을 만들자
        > 눈에 보이는 것들을 직접 만들면서 학습
        > 문법 AtoZ
        
        문법 o, 포기확률
        > 이후 학습속도 매우 빨라짐
        */
        
        /*
        && : 그리고 -> A && B -> A도 참이고, B도 참이어야 참
        || : 또는 -> A || B -> A가 참이거나, B가 참이면 참
        ! : 부정 -> 피연산자의 값이 참이면 부정으로, 부정이면 참으로
        */
        
        System.out.println("&& : AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("|| : OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! : 부정연산");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
