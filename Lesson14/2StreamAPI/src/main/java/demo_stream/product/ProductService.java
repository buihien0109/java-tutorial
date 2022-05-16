package demo_stream.product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {
    // 1. In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
    // Tên - Giá - Thương Hiệu - Số lượng
    // Ví dụ : OPPO Find X3 Pro - 19500000 - OPPO - 3
    public void print(List<Product> products) {
        products.stream().forEach(Product::printInfo);
    }

    // 2. Tính tổng tiền tất cả sản phẩm trong giỏ hàng
    // Tổng tiền mỗi sản phẩm = price * count
    public int getTotalMoney(List<Product> products) {
        return products
                .stream()
                .map(product -> product.getPrice() * product.getCount())
                .reduce(0, Integer::sum);
    }

    // 3. Tìm các sản phẩm của thuơng hiệu "Apple"
    public List<Product> findProductByBrand(List<Product> products, String brandName) {
        return products
                .stream()
                .filter(product -> product.getBrand().equalsIgnoreCase(brandName))
                .collect(Collectors.toList());
    }

    // 4. Tìm các sản phẩm có giá > 20000000
    public List<Product> findProductByPrice(List<Product> products, int price) {
        return products
                .stream()
                .filter(product -> product.getPrice() > price)
                .collect(Collectors.toList());
    }

    // 5. Tìm các sản phẩm có chữ "pro" trong tên (Không phân biệt hoa thường)
    public List<Product> findProductContainName(List<Product> products, String name) {
        return products
                .stream()
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product (Xóa thực sự)
    public List<Product> removeRandomProduct(List<Product> products) {
        Random rd = new Random();
        Product rdProduct = products.get(rd.nextInt(products.size()));
        return products
                .stream()
                .filter(product -> !product.equals(rdProduct))
                .toList();
    }

    // 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng
    public List<Product> removeProductByBrand(List<Product> products, String brandName) {
        return products
                .stream()
                .filter(product -> !product.getBrand().equals(brandName))
                .toList();
    }

    // 8. Sắp xếp giỏ hàng theo price tăng dần
    public List<Product> sortByPriceAsc(List<Product> products) {
        return products
                .stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    // 9. Sắp xếp giỏ hàng theo count giảm dần
    public List<Product> sortByCountDesc(List<Product> products) {
        return products
                .stream()
                .sorted(Comparator.comparing(Product::getCount).reversed())
                .collect(Collectors.toList());
    }

    // 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
    public List<Product> randomProduct(List<Product> products, int count) {
        // Tạo list mới
        List<Product> productsOther = new ArrayList<>(products);

        // Đổi chỗ ngẫu nhiên các phần tử trong list
        Collections.shuffle(productsOther);

        // Trả về số lượng phần tử đầu tiên trong list
        return productsOther.stream().limit(count).collect(Collectors.toList());
    }
}
