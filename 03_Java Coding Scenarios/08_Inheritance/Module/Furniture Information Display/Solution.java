import java.util.Scanner;

class Furniture{
    private String material;
    private int price;

    public Furniture(String material,int price){
        this.material=material;
        this.price=price;
    }

    public String getMaterial(){ 
      return material; 
    }
    public void setMaterial(String material){ 
      this.material=material;
     }

    public int getPrice(){ 
      return price; 
    }
    public void setPrice(int price){
      this.price=price; 
    }

    public String getInfo(){
        return "Material: "+material+", Price: "+price;
    }
}

class Chair extends Furniture{
    private String type;

    public Chair(String material,int price,String type){
        super(material,price);
        this.type=type;
    }

    public String getType(){ 
      return type; 
    }
    public void setType(String type){ 
      this.type=type; 
    }

    @Override
    public String getInfo(){
        return super.getInfo()+", Type: "+type;
    }
}

class Table extends Furniture{
    private String shape;

    public Table(String material,int price,String shape){
        super(material,price);
        this.shape=shape;
    }

    public String getShape(){ 
      return shape; 
    }
    public void setShape(String shape){ 
      this.shape=shape; 
    }

    @Override
    public String getInfo(){
        return super.getInfo()+", Shape: "+shape;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String furnitureType=sc.nextLine();
        String[] details=sc.nextLine().split(",");

        if(furnitureType.equalsIgnoreCase("Chair")){
            Chair chair=new Chair( details[0].trim(), Integer.parseInt(details[1].trim()),  details[2].trim());
            System.out.println("Furniture Info: "+chair.getInfo());
        } else if(furnitureType.equalsIgnoreCase("Table")){
            Table table=new Table( details[0].trim(), Integer.parseInt(details[1].trim()), details[2].trim());
            System.out.println("Furniture Info: "+table.getInfo());
        }
    }
}