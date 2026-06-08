import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int p=scanner.nextInt();

        int[][][] arr = new int[n][m][p];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<p; k++){
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<p; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}