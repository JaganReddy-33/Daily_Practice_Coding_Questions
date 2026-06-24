import java.util.*;

class Car{
    private String make;
    private String model;
    private int year;
    private float price;

    // getter and setter
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        if(make != null && !make.trim().isEmpty()){
            this.make = make;
        }
    }


    public String getModel(){
        return model;
    }
    public void setModel(String model){
        if(model != null && !model.trim().isEmpty()){
            this.model = model;
        }
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        int currYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        if(year >= 1886 && year <= currYear){
            this.year = year;
        }
    }

    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        if(price > 0){
            this.price = price;
        }
    }

}

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       Car c= new Car();

       c.setMake(sc.nextLine());
       c.setModel(sc.nextLine());
       c.setYear(sc.nextInt());
       c.setPrice(sc.nextFloat());

       System.out.println(c.getMake());
       System.out.println(c.getModel());
       System.out.println(c.getYear());

       System.out.println(c.getPrice());

    }
}