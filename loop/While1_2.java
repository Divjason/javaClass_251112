package loop;

public class While1_2 {
    public static void main(String[] args) {
        // while, do_while, for
        // while => ~동안에
        /*
        if(조건식) {
            조건 실행문
        }
        
        while(조건식) {
            반복문 실행
        }
         */
        int count = 0;

        while (count < 1000) {
            count++;
            System.out.println("현재 숫자는 : " + count);
        }
    }
}
