class Print extends Thread {
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello from Thread!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
       Print p= new Print();
       p.start();
       try{
        p.join();
       } catch(InterruptedException e){
        e.printStackTrace();
       }
    }
}