package btaptuan4;

import java.util.Scanner;

public class câu5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số nguyên thứ nhất: ");
		int a = scanner.nextInt();
		System.out.print("Nhập số nguyên thứ hai: ");
		int b = scanner.nextInt();

		System.out.println("USCLN " + USCLN(a, b));
		System.out.println("BCNN " + BCNN(a, b));
	}

	public static int USCLN(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}

		return a;
	}

	public static int BCNN(int a, int b) {
		return Math.abs(a * b) / USCLN(a, b);
	}
}
