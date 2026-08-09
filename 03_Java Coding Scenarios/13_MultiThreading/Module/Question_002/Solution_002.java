class Print implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<=2; i++){
            System.out.println("Running in Runnable!");
        }
    }
}

public class Main  {
    public static void main(String[] args) {
       Print p = new Print();
       Thread t = new Thread(p);
       t.start();

       try{
        t.join();
       } catch(InterruptedException e){
        e.printStackTrace();
       }
    }
}