    import java.util.Scanner;
public class giaithua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap mot so nguyen duong: ");
        int n = scanner.nextInt();
        if (n < 0) 
            System.out.println("Vui long nhap mot so nguyen dưuog.");
        else {
            long giaiThua = tinhGiaiThua(n);
            System.out.println("Giai thua cua " + n + " la: " + giaiThua);
        }
    }

    // Hàm tính giai thừa
    public static long tinhGiaiThua(int n) {
        long ketQua = 1;
        for (int i = 1; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }
}
