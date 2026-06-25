import java.util.Scanner;

class Product{

    private int productId;
    private String name;
    private int quantity;
    private float price;

    public void setProductId(int productId){
        this.productId = productId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(float price){
        this.price = price;
    }

    public int getProductID(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public float getPrice(){
        return price;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Product p = new Product();

        p.setProductId(Integer.parseInt(sc.nextLine()));
        p.setName(sc.nextLine());
        p.setQuantity(sc.nextInt());
        p.setPrice(sc.nextFloat());

        System.out.println(p.getProductID());
        System.out.println(p.getName());
        System.out.println(p.getQuantity());
        System.out.println(p.getPrice());



    }
}