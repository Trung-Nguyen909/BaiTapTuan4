package btaptuan4;

import java.util.Scanner;

public class câu4 {
	// Hàm kiểm tra số nguyên tố
	public static boolean isPrime(int n) {
		// Số nhỏ hơn 2 không phải là số nguyên tố
		if (n < 2) {
			return false;
		}

		// Kiểm tra các ước số từ 2 đến căn bậc hai của n
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false; // Nếu tìm thấy ước số thì n không phải số nguyên tố
			}
		}

		return true; // Nếu không tìm thấy ước số thì n là số nguyên tố
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập vào một số nguyên
		System.out.print("Nhập một số nguyên: ");
		int number = scanner.nextInt();

		// Kiểm tra và in kết quả
		if (isPrime(number)) {
			System.out.println(number + " là số nguyên tố.");
		} else {
			System.out.println(number + " không phải là số nguyên tố.");
		}

		scanner.close();
	}
}
