import java.util.Arrays;
import java.util.Scanner;
public class SortProgram {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013};
        Arrays.sort(my_array1);
        int sum = 0;
        for(int num: my_array1){
            sum += num;
        }
        double average = (double)sum/ my_array1.length;
        System.out.println("Mang da sap xep:" + Arrays.toString(my_array1));
        System.out.println("Tong:" + sum);
        System.out.println("Trung binh:" + average);


    }
}
