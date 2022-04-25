package vn.techmaster;

public class PrintShape {
    public static void main(String[] args) {
        drawFullRectangle(3, 5);

        drawEmptyRectangle(3, 5);

        drawX(5);

        drawTriangle(5);

        drawTriangle1(5);

        drawTriangle2(5);

        drawTriangle3(5);

        drawButterfly(7);
    }

    public static void drawButterfly(int side) {
        
    }

    public static void drawFullRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawEmptyRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawX(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if(i == j || i == side - j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if(i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTriangle1(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if(i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTriangle2(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if(i <= side - j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTriangle3(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if(i >= side - j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
