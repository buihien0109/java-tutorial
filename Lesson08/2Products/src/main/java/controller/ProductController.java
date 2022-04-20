package controller;

import model.Product;
import service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {

    private final ProductService productService = new ProductService();

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isQuit = false;
        int option = 0;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> {
                    List<Product> products = productService.getProducts();

                    if (products.isEmpty()) {
                        System.out.println("Không có sản phẩm nào trong danh sách");
                    } else {
                        System.out.println("Danh sách sản phẩm");
                        products.forEach(System.out::println);
                    }
                }
                case 2 -> {
                    System.out.print("Nhập tên của sản phẩm : ");
                    String name = sc.nextLine();

                    Product product = productService.findByName(name);
                    if (product == null) {
                        System.out.println("Không tìm thấy sản phẩm với tên = " + name);
                    } else {
                        System.out.println(product);
                    }
                }
                case 3 -> {
                    System.out.print("Nhập id của sản phẩm : ");
                    int id = Integer.parseInt(sc.nextLine());

                    Product product = productService.findById(id);
                    if (product == null) {
                        System.out.println("Không tìm thấy sản phẩm với id = " + id);
                    } else {
                        System.out.println(product);

                        // Todo : Xử lý submenu
                        boolean isQuit1 = false;
                        int option1 = 0;

                        while (!isQuit1) {
                            showSubmenu1();

                            System.out.print("Nhập lựa chọn : ");
                            option1 = Integer.parseInt(sc.nextLine());

                            switch (option1) {
                                case 1 -> {
                                    productService.deleteProduct(id);
                                    System.out.println("Xóa sản phẩm với id = " + id + " thành công");
                                    isQuit1 = true;
                                }
                                case 2 -> {
                                    System.out.print("Nhập số lượng mới : ");
                                    int newCount = Integer.parseInt(sc.nextLine());

                                    productService.updateCount(id, newCount);
                                    System.out.println("Sản phẩm có id = " + id + " đã được cập nhật số lượng mới = " + newCount);
                                }
                                case 3 -> {
                                    isQuit1 = true;
                                }
                                default -> {
                                    System.out.println("Lựa chọn không phù hợp");
                                }
                            }
                        }

                    }
                }
                case 4 -> {
                    List<Product> result = productService.findByCount(5);

                    if (result.isEmpty()) {
                        System.out.println("Không tìm thấy sản phẩm phù hợp");
                    } else {
                        result.forEach(System.out::println);
                    }
                }
                case 5 -> {
                    // Todo : Xử lý submenu
                    boolean isQuit2 = false;
                    int option2 = 0;

                    while (!isQuit2) {
                        showSubmenu2();

                        System.out.print("Nhập lựa chọn : ");
                        option2 = Integer.parseInt(sc.nextLine());

                        switch (option2) {
                            case 1 -> {
                                List<Product> products = productService.findByPrice(0, 50_000);

                                if (products.isEmpty()) {
                                    System.out.println("Không có sản phẩm thỏa mãn điều kiện");
                                } else {
                                    products.forEach(System.out::println);
                                }
                            }
                            case 2 -> {
                                List<Product> products = productService.findByPrice(50_000, 100_000);

                                if (products.isEmpty()) {
                                    System.out.println("Không có sản phẩm thỏa mãn điều kiện");
                                } else {
                                    products.forEach(System.out::println);
                                }
                            }
                            case 3 -> {
                                List<Product> products = productService.findByPrice(100_000, Integer.MAX_VALUE);

                                if (products.isEmpty()) {
                                    System.out.println("Không có sản phẩm thỏa mãn điều kiện");
                                } else {
                                    products.forEach(System.out::println);
                                }
                            }
                            case 4 -> {
                                isQuit2 = true;
                            }
                            default -> {
                                System.out.println("Lựa chọn không phù hợp");
                            }
                        }
                    }
                }
                case 6 -> {
                    isQuit = true;
                }
                default -> {
                    System.out.println("Lựa chọn không phù hợp");
                }
            }
        }
    }


    public void showMenu() {
        System.out.println("1 - Xem danh sách sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Tìm sản phẩm theo id");
        System.out.println("4 - Tìm các sản phẩn có số lượng dưới 5");
        System.out.println("5 - Tìm sản phẩm theo mức giá");
        System.out.println("6 - Thoát");
    }

    public void showSubmenu1() {
        System.out.println("1 - Xóa sản phẩm");
        System.out.println("2 - Cập nhật số lượng sản phẩm");
        System.out.println("3 - Về menu chính");
    }

    public void showSubmenu2() {
        System.out.println("1 - Dưới 50.000");
        System.out.println("2 - Từ 50.000 đến dưới 100.000");
        System.out.println("3 - Từ 100.000 trở lên");
        System.out.println("4 - Về menu chính");
    }
}
