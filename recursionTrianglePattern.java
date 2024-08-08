public class recursionTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
        printTriangleq(n-1);
    }

    public static void printTriangle(int n) {
        if (n > 0) {
            printTriangle(n - 1); 
            printStars(n);
            System.out.println();
        }
    }

    public static void printStars(int n) {
        if (n > 0) {
            System.out.print("* ");
            printStars(n - 1);
        }
    }
    public static void printTriangleq(int n) {
        if (n > 0) {
                        printStars(n);
                        System.out.println();
            printTriangleq(n - 1); 
        }
    }

    public static void printStarsq(int n) {
        if (n > 0) {
            System.out.print("* ");
            printStarsq(n - 1);
        }
    }
}
