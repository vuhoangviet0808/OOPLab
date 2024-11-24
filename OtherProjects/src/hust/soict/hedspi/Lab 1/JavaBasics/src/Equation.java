import java.util.Scanner;

public class Equation {

    static class Linear1 {
        double a, b;

        Linear1(double a, double b) {
            this.a = a;
            this.b = b;
        }

        void solve() {
            if (a == 0) {
                System.out.println("Phuong trinh vo nghiem (a = 0).");
            } else {
                System.out.println("Nghiem: x = " + (-b / a));
            }
        }
    }

    static class Linear2 {
        double a11, a12, b1, a21, a22, b2;

        Linear2(double a11, double a12, double b1, double a21, double a22, double b2) {
            this.a11 = a11;
            this.a12 = a12;
            this.b1 = b1;
            this.a21 = a21;
            this.a22 = a22;
            this.b2 = b2;
        }

        void solve() {
            double D = a11 * a22 - a12 * a21;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D == 0) {
                if (D1 == 0 && D2 == 0) System.out.println("Vo so nghiem.");
                else System.out.println("Vo nghiem.");
            } else {
                System.out.println("Nghiem: x1 = " + (D1 / D) + ", x2 = " + (D2 / D));
            }
        }
    }

    static class Quadratic {
        double a, b, c;

        Quadratic(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        void solve() {
            if (a == 0) {
                new Linear1(b, c).solve();
                return;
            }

            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                System.out.println("Nghiem: x1 = " + ((-b + Math.sqrt(delta)) / (2 * a))
                        + ", x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            } else if (delta == 0) {
                System.out.println("Nghiem kep: x = " + (-b / (2 * a)));
            } else {
                System.out.println("Vo nghiem.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chon loai phuong trinh:");
        System.out.println("1. Phuong trinh bac 1 (ax + b = 0)");
        System.out.println("2. He phuong trinh bac 1 (2 an)");
        System.out.println("3. Phuong trinh bac 2 (ax^2 + bx + c = 0)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhap a, b: ");
                double a1 = sc.nextDouble();
                double b1 = sc.nextDouble();
                new Linear1(a1, b1).solve();
                break;
            case 2:
                System.out.print("Nhap a11, a12, b1, a21, a22, b2: ");
                double a11 = sc.nextDouble();
                double a12 = sc.nextDouble();
                double b11 = sc.nextDouble();
                double a21 = sc.nextDouble();
                double a22 = sc.nextDouble();
                double b21 = sc.nextDouble();
                new Linear2(a11, a12, b11, a21, a22, b21).solve();
                break;
            case 3:
                System.out.print("Nhap a, b, c: ");
                double a2 = sc.nextDouble();
                double b2 = sc.nextDouble();
                double c2 = sc.nextDouble();
                new Quadratic(a2, b2, c2).solve();
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }

        sc.close();
    }
}