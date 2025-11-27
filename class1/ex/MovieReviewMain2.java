package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        // MovieReviewMain1 -> 해당 소스코드에서 각 영화들의 리뷰값만 저장한 배열을 선언
        // 해당 배열 내 값을 반복문을 활용해서 출력할 수 있는 코드로 리팩토링 해주세요~

        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        for (MovieReview review: reviews) {
            System.out.printf("리뷰 : %s\n", review.review);
        }
    }
}
