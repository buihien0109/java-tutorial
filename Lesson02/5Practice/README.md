### Thực hành String

Thực hiện 1 số so sánh với String và dự đoán kết quả

```
String str1 = "Bùi Hiên"
String str2 = "Bùi Hiên"
String str3 = new String("Bùi Hiên")

System.out.println(str1 == str2)
System.out.println(str2 == str3)
System.out.println(str1 == str3)
System.out.println(str1.equals(str2))
System.out.println(str2.equals(str3))
```

### Thực hành Scanner

**Bài 1** : Viết chương trình nhập vào 2 số nguyên dương a, b bất kỳ từ bàn phím

Thực hiện tính toán các phép tính sau đây và in ra kết quả:

- a + b
- a - b
- a * b
- a / b
- a^b (a mũ b)
- a % 2 (a chia dư cho b)

**Ví dụ**

![thực hành scanner](https://media.techmaster.vn/api/static/9479/SaypkJHm)


**Bài 2** : Nhập vào 1 chuỗi bất kỳ từ bàn phím

Thực hiện các công việc sau:

1. In ra chuỗi in hoa của chuỗi vừa nhập
2. In ra chuỗi in thường của chuỗi vừa nhập
3. Đếm số ký tự trong chuỗi
4. In ra ký tự cuối cùng trong chuỗi
5. In ra **5 ký tự đầu tiên** của chuỗi
6. Kiểm tra chuỗi vừa nhập có chứa chuỗi "**hello**" hay không? in ra **true** nếu chứa, ngược lại thì in ra **false** nếu không chứa

![thực hành scanner string](https://media.techmaster.vn/api/static/9479/DPY8gAOT)

### Thực hành toán tử

Bài 1 : Dự đoán kết quả của 1 số biểu thức sau và giải thích kết quả

```java
int a = 10;
int b = 20;

int c = a++;
int d = ++a;

int e = a++ ++b;
int f = ++a + ++b;
```

Bài 2 : Làm thế nào để hoán đổi giá trị của 2 biến a, b

**Ví dụ**

```java
int a = 10;
int b = 20;

// Hoán đổi giá trị như thế nào để

a = 20;
b = 10;
```