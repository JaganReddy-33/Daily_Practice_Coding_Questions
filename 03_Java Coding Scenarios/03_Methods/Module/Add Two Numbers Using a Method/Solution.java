class Main {
    public static void main(String[] args) {
       
        int a = 5; 
        int b = 10;

        int result = addNumbers(a, b);
        System.out.println(result);
    }

    public static int addNumbers(int x, int y) {
       int z =  x + y;
       return z;
    }
}