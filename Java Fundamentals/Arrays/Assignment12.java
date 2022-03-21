import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers for Array 1 : ");
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }

		System.out.println("Enter 3 numbers for Array 2 : ");
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }

		int[] arr3 = new int[2];
        arr3[0] = arr1[1];
        arr3[1] = arr2[1];
        System.out.println("[" + arr3[0] + ", " + arr3[1] + "]");
    }
}
