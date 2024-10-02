    import java.util.Scanner;
public class UCLNbcnn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập vào hai số nguyên
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b = scanner.nextInt();
        
        // Tính UCLN
        int ucln = findGCD(a, b);
        
        // Tính BCNN
        int bcnn = (a * b) / ucln;
        
        // Xuất kết quả
        System.out.println("UCLN cua " + a + " va " + b + " la: " + ucln);
        System.out.println("BCNN cua " + a + " va " + b + " la: " + bcnn);
        
        scanner.close();
    }
    
    // Hàm tìm UCLN sử dụng thuật toán Euclid
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}