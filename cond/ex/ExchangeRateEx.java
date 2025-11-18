package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        /*
        10달러 있다고 가정,
        달러가 존재한다면, 환율 1300원을 기준으로 환전금액은 13000원 입니다.
        달러가 없다면, 환전할 금액이 없습니다.
        달러가 -금액이라고 한다면, 잘못된 금액입니다.
        */

        int dollar = 10;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        }
        else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        }
        else {
            int won = dollar * 1300;
            System.out.println("환전금액은 " + won + "원 입니다.");
        }
    }
}
