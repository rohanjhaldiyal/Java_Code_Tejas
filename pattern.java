public class pattern {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int c = (i >= n) ? 2 * n - i : i;
                for (int j = 1; j <= c; j++) {
                System.out.print("*");
        }
            System.out.println();
        }
    }
    static void pattern28(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int c = (i >= n) ? 2 * n - i : i;
            for (int k = 1; k <= n - c; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
            System.out.print("* ");
        }
            System.out.println();
        }
    }
}
