import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so hang: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap vao so cot: ");
        int columns = scanner.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];
        System.out.println("Nhap vao cac so cua ma tran dau tien:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Gia tri tai (" + i + ", " + j + "): ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhap vao cac so cua ma tran thu hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Gia tri tai (" + i + ", " + j + "): ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Ket qua sau khi cong ma tran:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
