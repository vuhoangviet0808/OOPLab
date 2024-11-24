import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("n = ?");
        int n = keyboard.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--) System.out.print(' ');
            for(int k=1;k<=2*i-1;k++) System.out.print('*');
            for(int j=n-i;j>=1;j--) System.out.print(' ');
            System.out.print('\n');
        }
    }
}