package btaptuan4;

import java.util.Scanner;

public class câu6 {
	public static boolean kiemTraDoiXung(int n) {
		int soGoc = n;
		int soDaoNguoc = 0;

		while (n > 0) {
			int chuSo = n % 10;
			soDaoNguoc = soDaoNguoc * 10 + chuSo;
			n /= 10;
		}

		return soGoc == soDaoNguoc;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập một số nguyên: ");
		int n = scanner.nextInt();

		if (kiemTraDoiXung(n)) {
			System.out.println(n + " là số đối xứng.");
		} else {
			System.out.println(n + " không phải là số đối xứng.");
		}
	}
}
