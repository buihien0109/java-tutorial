### Bài kiểm tra số 1

#### Câu 1

Viết chương trình thực hiện:

**1.In ra màn hình hình vuông \***

```
* * * *
* * * *
* * * *
* * * *
```

**2.In ra màn hình hình tam giác \***

```
*
* *
* * *
* * * *
```

Hoặc

```
      *
    * *
  * * *
* * * *
```

#### Câu 2

Cho chuỗi sau : `You only live once, but if you do it right, once is enough`

Thực hiện:

- Đếm số từ trong chuỗi
- Đếm và in ra index của các ký tự `o`

#### Câu 3

Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không.

Phương thức kiểm tra số nguyên tố:

```java
public static boolean isPrimeNumber(int n) {
    if (n < 2) {
        return false;
    }
    int squareRoot = (int) Math.sqrt(n);
    for (int i = 2; i <= squareRoot; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
```

#### Câu 4

Viết chương trình thực hiện:

- Liệt kê 10 số nguyên tố đầu tiên
- Liệt kê các số nguyên tố nhỏ hơn 10


#### Câu 5

Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím. Thực hiện:

- Nhập các phần tử mảng
- In thông tin mảng ra màn hình
- Liệt kê các phần tử nằm trên đường chéo chính
- Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau  

#### Câu 6 (Nâng cao) 
Viết chương trình nhập vào từ bàn phím email và số điện thoại, kiểm tra email và số điện thoại đó có hợp lệ không. 
- Email phải đúng định dạng
- Số điện thoại có chứa từ 9 đến 11 chữ số  

Gợi ý: Sử dụng regex [https://viettuts.vn/java/su-dung-regex-trong-java](https://viettuts.vn/java/su-dung-regex-trong-java)