import java.util.*;

class Restaurant{
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;


    public Restaurant(int id, String name, String email, long phone, String address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

        public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
        }
        public long getPhone(){
            return phone;
        }
        public String getAddress(){
            return address;
        }
}


class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String input  = sc.nextLine();
       String[] data = input.split(",");

       int id = Integer.parseInt(data[0].trim());
       String name = data[1].trim();
       String email = data[2].trim();
       long phone = Long.parseLong(data[3].trim());
       String address = data[4].trim();

       Restaurant rs = new Restaurant(id, name, email, phone, address);

       System.out.println(rs.getId());
       System.out.println(rs.getName());
       System.out.println(rs.getEmail());
       System.out.println(rs.getPhone());
       System.out.println(rs.getAddress());



    }
}