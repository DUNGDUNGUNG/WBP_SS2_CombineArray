import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter a element array1: ");
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[4];
        for (int j = 0; j < array2.length; j++) {
            System.out.print("Enter a element array2: ");
            array2[j] = sc.nextInt();
        }
        int[] array3 = new int[7];
        int d = 0;
        for (int a : array1) {
            array3[d] = a;
            d++;
        }
        for (int b : array2) {
            array3[d] = b;
            d++;
        }
        System.out.println("Element array3: ");
        for (int t : array3) {
            System.out.print(t + "\t");
        }
    }
}
