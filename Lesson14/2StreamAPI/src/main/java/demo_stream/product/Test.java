package demo_stream.product;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        // Tạo ra danh sách sản phẩm
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone 13 Pro Max", 30_000_000, "Apple", 2));
        products.add(new Product(2, "Samsung Galaxy Z Fold3", 41_000_000, "Samsung", 3));
        products.add(new Product(3, "IPhone 11", 12_000_000, "Apple", 1));
        products.add(new Product(4, "OPPO Find X3 Pro", 19_500_000, "Oppo", 5));
        products.add(new Product(5, "Xiaomi 11T", 9_500_000, "Xiaomi", 7));
        products.add(new Product(6, "Vivo V21", 23_500_000, "Vivo", 6));

        // 1. In ra thông tin tất cả sản phẩm
        productService.print(products);
        System.out.println();

        // 2. Tính tổng tiền đơn hàng
        int total = productService.getTotalMoney(products);
        System.out.println("Tổng tiền giỏ hàng = " + total + "\n");

        // 3. Tìm các sản phẩm của thuơng hiệu
        productService.findProductByBrand(products, "Apple").forEach(Product::printInfo);
        System.out.println();

        // 4. Tìm các sản phẩm có giá
        productService.findProductByPrice(products, 20_000_000).forEach(Product::printInfo);
        System.out.println();

        // 5. Tìm các sản phẩm có chữ "pro" trong tên
        productService.findProductContainName(products, "pro").forEach(Product::printInfo);
        System.out.println();

        // 6. Xóa sản phẩm bất kỳ
        products = productService.removeRandomProduct(products);
        productService.print(products);
        System.out.println();

        // 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng
        products = productService.removeProductByBrand(products, "Samsung");
        productService.print(products);
        System.out.println();

        // 8. Sắp xếp giỏ hàng theo price tăng dần
        productService.print(productService.sortByPriceAsc(products));
        System.out.println();

        // 9. Sắp xếp giỏ hàng theo count giảm dần
        productService.print(productService.sortByCountDesc(products));
        System.out.println();

        // 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
        productService.print(productService.randomProduct(products, 2));
    }
}
