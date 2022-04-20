package service;

import model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
    private List<Product> products;

    // Trong constructor thì gọi init để tạo danh sách sản phẩm ban đầu
    public ProductService() {
        init();
    }

    // Khởi tạo danh sách sản phẩm
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1, "Sản phẩm 1", "Mô tả 1", 10, 40_000));
        products.add(new Product(2, "Sản phẩm 2", "Mô tả 2", 20, 70_000));
        products.add(new Product(3, "Sản phẩm 3", "Mô tả 3", 14, 30_000));
        products.add(new Product(4, "Sản phẩm 4", "Mô tả 4", 2, 60_000));
        products.add(new Product(5, "Sản phẩm 5", "Mô tả 5", 4, 70_000));
        products.add(new Product(6, "Sản phẩm 6", "Mô tả 6", 8, 170_000));
        products.add(new Product(7, "Sản phẩm 7", "Mô tả 7", 23, 20_000));
        products.add(new Product(8, "Sản phẩm 8", "Mô tả 8", 10, 190_000));
        products.add(new Product(9, "Sản phẩm 9", "Mô tả 9", 11, 180_000));
        products.add(new Product(10, "Sản phẩm 10", "Mô tả 10", 3, 50_000));
    }

    // Lấy danh sách tất cả sản phẩm
    public List<Product> getProducts() {
        return products;
    }

    // Lọc sản phẩm theo id
    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // Cập nhật số lượng sản phẩm theo id
    public void updateCount(int id, int newCount) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setCount(newCount);
            }
        }
    }

    // Lọc sản phẩm theo tên
    public Product findByName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    // Tìm sản phẩm theo khoảng giá min - max
    public List<Product> findByPrice(int minPrice, int maxPrice) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() >= minPrice && p.getPrice() < maxPrice) {
                result.add(p);
            }
        }

        return result;
    }

    // Tìm sản phẩm byCount
    public List<Product> findByCount(int maxCount) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getCount() < maxCount) {
                result.add(p);
            }
        }

        return result;
    }

    // Xóa sản phẩm theo id
    // Lỗi ConcurrentModificationException.
    // Cách xử lý : https://gpcoder.com/4289-tranh-loi-concurrentmodificationexception-trong-java-nhu-the-nao/
    public void deleteProduct(int id) {
        // Lỗi phát sinh nếu cố gắng sử dụng remove bên trong forEach();
//        for (Product p: products) {
//            if(p.getId() == id) {
//                products.remove(p);
//            }
//        }

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
            }
        }
    }
}
