import java.util.*;

class Menu{

    private int id;
    private String name;
    private double price;
    private String description;


    public Menu(int id, String name, double price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getDesc(){
        return description;
    }
}


class Main {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);

     String input  = sc.nextLine();
     String[] data = input.split(",");

     int id = Integer.parseInt(data[0].trim());
     String name = data[1].trim();
     double price = Double.parseDouble(data[2].trim());
     String description = data[3].trim();


     Menu m = new Menu(id, name, price, description);

     System.out.println(m.getId());
     System.out.println(m.getName());
     System.out.println(m.getPrice());
     System.out.println(m.getDesc());
    }
}