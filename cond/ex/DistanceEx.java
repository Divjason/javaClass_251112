package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        /*
        거리에 따른 운송수단을 출력하는 코드를 작성!!
        거리 1 -> 도보를 이용하세요.
        거리 5 -> 자전거를 이용하세요.
        거리 25 -> 자동차를 이용하세요.
        거리 150 -> 비행기를 이용하세요.

        25 가정, 위 조건에 따라 알맞은 문장이 출력되도록 코드 작성!
        
        코딩을 잘하는 방법
        <-> 코딩을 잘 못하는 방법

        1) 해당 언어에 대한 문법을 잘 모른다.
        > 자주, 반복, 외우면 됨

        2) 논리적인 사고 부족하다.
        > pseudo code : 가짜의 코드
        > 코드를 작성 전, 말로 작성!!
        > 현업, 개발자 -> 코드 x
        > 어떤 문법, 프레임워크, 라이브러리, 방식, 코드 (60%) + 40%
        > TV, 영화 -> 키보드
        */

        int distance = 25;

        if(distance <= 1) System.out.println("도보를 이용하세요.");
        else if (distance <= 10) System.out.println("자전거를 이용하세요.");
        else if (distance <= 100) System.out.println("자동차를 이용하세요.");
        else System.out.println("비행기를 이용하세요.");
        
        /*
        if(조건식 => 참, 거짓) {
            실행문
        }

        } else {
        */
    }
}
