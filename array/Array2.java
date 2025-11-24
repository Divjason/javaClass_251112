package array;

public class Array2 {
    public static void main(String[] args) {
        // 2차원 행, 열 기준으로 값을 생성!
        // 1차원 배열 행

//        int[][] arr = new int[2][3];
//
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

//        System.out.print(arr[0][0] + " ");
//        System.out.print(arr[0][1] + " ");
//        System.out.print(arr[0][2] + " ");
//        System.out.println();
//        System.out.print(arr[1][0] + " ");
//        System.out.print(arr[1][1] + " ");
//        System.out.print(arr[1][2] + " ");

        for (int row = 0; row < 2; row++) {
//            System.out.print(arr[row][0] + " ");
//            System.out.print(arr[row][1] + " ");
//            System.out.print(arr[row][2] + " ");
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
