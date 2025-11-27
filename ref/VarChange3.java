package ref;

public class VarChange3 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.printf("%d, %d\n", dataA.value, dataB.value);

        dataA.value = 20;
        System.out.println(dataA.value);
        System.out.println(dataB.value);

        dataB.value = 30;
        System.out.println(dataA.value);
        System.out.println(dataB.value);
        
        // 변수안에 담긴 주소값 참조
    }
}
