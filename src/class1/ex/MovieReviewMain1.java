package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        //영화 리뷰 정보 선언
        //영화 리뷰 정보 출력

        MovieReview movie1 = new MovieReview();
        movie1.title="인셉션";
        movie1.review="인생은 무한 루프!";

        MovieReview movie2 = new MovieReview();
        movie2.title="어바웃 타임";
        movie2.review="인생 시간 영화!";

        MovieReview[] moviearray = {movie1, movie2};

        for (int i=0; i<moviearray.length;i++){
            System.out.println("영화 제목 :"+moviearray[i].title+" 리뷰: "+moviearray[i].review);
        }

        System.out.println();
        for (MovieReview movieReview : moviearray) {
            System.out.println("영화 제목 :"+movieReview.title+" 리뷰: "+movieReview.review);

        }
    }
}
