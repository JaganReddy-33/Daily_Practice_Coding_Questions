import java.util.Scanner;

class Review{
    private int reviewId;
    private String productName;
    private String reviewerName;
    private String reviewText;


    public void setId(int reviewId){
        this.reviewId = reviewId;
    }
    public void setProdName(String productName){
        this.productName = productName;
    }
    public void setReviewrName(String reviewerName){
        this.reviewerName = reviewerName;
    }
    public void setReviewText(String reviewText){
        this.reviewText = reviewText;
    }

    public int getId(){
        return reviewId;
    }
    public String getProdName(){
        return productName;
    }
    public String getReviewerName(){
        return reviewerName;
    }
    public String getReviewText(){
        return reviewText;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Review r = new Review();

        r.setId(Integer.parseInt(sc.nextLine()));
        r.setProdName(sc.nextLine());
        r.setReviewrName(sc.nextLine());
        r.setReviewText(sc.nextLine());


        System.out.println(r.getId());
        System.out.println(r.getProdName());
        System.out.println(r.getReviewerName());
        System.out.println(r.getReviewText());
      
    }
}