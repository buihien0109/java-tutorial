package vn.techmaster;

public class Array2D {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int number02 = numbers[0][2];
        System.out.println("Phần tử ở vị trí hàng 1, cột 2 là : " + number02);

        // In ra các phần tử của mảng
        System.out.println("Các phần tử trong mảng : ");
        for (int[] row : numbers) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        // Tính tổng các phần tử trong mảng
        int total = 0;
        for (int[] row : numbers) {
            for (int value : row) {
                total += value;
            }
        }
        System.out.println("Tổng các phần tử trong mảng là : " + total);

        // Tính tổng các phần tử chẵn trong mảng
        int totalEven = 0;
        for (int[] row : numbers) {
            for (int value : row) {
                if (value % 2 == 0) {
                    totalEven += value;
                }
            }
        }
        System.out.println("Tổng các phần tử chẵn trong mảng là : " + totalEven);

        // Tìm giá trị lớn nhất trong mảng
        int max = numbers[0][0];
        for (int[] row : numbers) {
            for (int value : row) {
                if (max < value) {
                    max = value;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là : " + max);

        // Tìm giá trị lớn nhất theo từng row
        for (int i = 0; i < numbers.length; i++) {
            int maxRow = numbers[i][0];
            for (int j = 0; j < numbers[i].length; j++) {
                if (maxRow < numbers[i][j]) {
                    maxRow = numbers[i][j];
                }
            }
            System.out.println("Phần tử lớn nhất của hàng " + (i + 1) + " là : " + maxRow);
        }
    }
}
