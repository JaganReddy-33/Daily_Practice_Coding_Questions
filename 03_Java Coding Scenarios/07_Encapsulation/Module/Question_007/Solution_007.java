import java.util.Scanner;

class Feedback{

    private int customerId;
    private String feedbackText;
    private int rating;

    public void setId(int customerId){
        this.customerId = customerId;
    }
    public void setText(String feedbackText){
        this.feedbackText = feedbackText;
    }
    public void setRating(int rating){
        this.rating = rating;
    }

    public int getId(){
        return customerId;
    }
    public String getText(){
        return feedbackText;
    }
    public int getRating(){
        return rating;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a Feedback object
        Feedback fb= new Feedback();

        // Take input for all the attributes using setter methods
        fb.setId(Integer.parseInt(sc.nextLine()));
        fb.setText(sc.nextLine());
        fb.setRating(sc.nextInt());

        // Display the feedback information using getter methods
        System.out.println(fb.getId());
        System.out.println(fb.getText());
        System.out.println(fb.getRating());
    }
}