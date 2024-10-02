    import java.util.Scanner;
public class songuyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int n = scanner.nextInt();

        if (songuyen(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }

        scanner.close();
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean songuyen(int n) {
        if (n <= 1)
            return false; // Các số <= 1 không phải số nguyên tố
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
                return false; // N nếu chia hết cho i thì không phải số nguyên tố
        }
        return true; // Nếu không tìm thấy ước số nào khác ngoài 1 và n
    }
}
