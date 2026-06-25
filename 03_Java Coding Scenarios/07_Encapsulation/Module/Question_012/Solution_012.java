import java.util.*;

class Restaurant{
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(long phone){
        this.phone = phone;
    }
    public void setAddress(String address){
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


class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Restaurant[] restaurants = new Restaurant[n];

        for(int i=0; i<n; i++){
            Restaurant r = new Restaurant();

            r.setId(Integer.parseInt(sc.nextLine()));
            r.setName(sc.nextLine());
            r.setEmail(sc.nextLine());
            r.setPhone(Long.parseLong(sc.nextLine()));
            r.setAddress(sc.nextLine());

            restaurants[i] = r;
        }
        for(int i=0; i<n; i++){
            System.out.println(restaurants[i].getId());
            System.out.println(restaurants[i].getName());
            System.out.println(restaurants[i].getEmail());
            System.out.println(restaurants[i].getPhone());
            System.out.println(restaurants[i].getAddress());
        }
    }
}