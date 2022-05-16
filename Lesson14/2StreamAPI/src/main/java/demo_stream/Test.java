package demo_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // Tạo ra danh sách sản phẩm
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone 13 Pro Max", 30_000_000, "Apple", 2));
        products.add(new Product(2, "Samsung Galaxy Z Fold3", 41_000_000, "Samsung", 3));
        products.add(new Product(3, "IPhone 11", 12_000_000, "Apple", 1));
        products.add(new Product(4, "OPPO Find X3 Pro", 19_500_000, "Oppo", 5));
        products.add(new Product(5, "Xiaomi 11T", 9_500_000, "Xiaomi", 7));
        products.add(new Product(6, "Vivo V21", 23_500_000, "Vivo", 6));

        // 1. In ra thông tin tất cả sản phẩm
        print(products);
        System.out.println();

        // 2. Tính tổng tiền đơn hàng
        int total = getTotalMoney(products);
        System.out.println("Tổng tiền giỏ hàng = " + total + "\n");

        // 3. Tìm các sản phẩm của thuơng hiệu
        findProductByBrand(products,"Apple").forEach(Product::printInfo);
        System.out.println();

        // 4. Tìm các sản phẩm có giá
        findProductByPrice(products,20_000_000).forEach(Product::printInfo);
        System.out.println();

        // 5. Tìm các sản phẩm có chữ "pro" trong tên
        findProductContainName(products, "pro").forEach(Product::printInfo);
        System.out.println();

        // 6. Xóa sản phẩm bất kỳ
        products = removeRandomProduct(products);
        print(products);
        System.out.println();

        // 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng
        products = removeProductByBrand(products, "Samsung");
        print(products);
        System.out.println();

        // 8. Sắp xếp giỏ hàng theo price tăng dần
        print(sortByPriceAsc(products));
        System.out.println();

        // 9. Sắp xếp giỏ hàng theo count giảm dần
        print(sortByCountDesc(products));
        System.out.println();

        // 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
        print(randomProduct(products, 2));
    }

    // 1. In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
    // Tên - Giá - Thương Hiệu - Số lượng
    // Ví dụ : OPPO Find X3 Pro - 19500000 - OPPO - 3
    public static void print(List<Product> products) {
        products.stream().forEach(Product::printInfo);
    }

    // 2. Tính tổng tiền tất cả sản phẩm trong giỏ hàng
    // Tổng tiền mỗi sản phẩm = price * count
    public static int getTotalMoney(List<Product> products) {
        return products
                .stream()
                .map(product -> product.getPrice() * product.getCount())
                .reduce(0, Integer::sum);
    }

    // 3. Tìm các sản phẩm của thuơng hiệu "Apple"
    public static List<Product> findProductByBrand(List<Product> products, String brandName) {
        return products
                .stream()
                .filter(product -> product.getBrand().equalsIgnoreCase(brandName))
                .collect(Collectors.toList());
    }

    // 4. Tìm các sản phẩm có giá > 20000000
    public static List<Product> findProductByPrice(List<Product> products, int price) {
        return products
                .stream()
                .filter(product -> product.getPrice() > price)
                .collect(Collectors.toList());
    }

    // 5. Tìm các sản phẩm có chữ "pro" trong tên (Không phân biệt hoa thường)
    public static List<Product> findProductContainName(List<Product> products, String name) {
        return products
                .stream()
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product (Xóa thực sự)
    public static List<Product> removeRandomProduct(List<Product> products) {
        Random rd = new Random();
        Product rdProduct = products.get(rd.nextInt(products.size()));
        return products
                .stream()
                .filter(product -> !product.equals(rdProduct))
                .toList();
    }

    // 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng
    public static List<Product> removeProductByBrand(List<Product> products, String brandName) {
        return products
                .stream()
                .filter(product -> !product.getBrand().equals(brandName))
                .toList();
    }

    // 8. Sắp xếp giỏ hàng theo price tăng dần
    public static List<Product> sortByPriceAsc(List<Product> products) {
        return products
                .stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    // 9. Sắp xếp giỏ hàng theo count giảm dần
    public static List<Product> sortByCountDesc(List<Product> products) {
        return products
                .stream()
                .sorted(Comparator.comparing(Product::getCount).reversed())
                .collect(Collectors.toList());
    }

    // 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
    public static List<Product> randomProduct(List<Product> products, int count) {
        // Tạo list mới
        List<Product> productsOther = new ArrayList<>(products);

        // Đổi chỗ ngẫu nhiên các phần tử trong list
        Collections.shuffle(productsOther);

        // Trả về số lượng phần tử đầu tiên trong list
        return productsOther.stream().limit(count).collect(Collectors.toList());
    }
}
