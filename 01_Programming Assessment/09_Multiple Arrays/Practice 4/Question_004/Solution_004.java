import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        
        merge(arr1, n - m, arr2, m);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void merge(int[] nums1, int n, int[] nums2, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;
        
        while (i >= 0 && j >= 0) {
            nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}