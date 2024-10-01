package btaptuan4;

import java.util.Scanner;

public class câu3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n = sc.nextInt();
		if (n < 0)
			System.out.println("giai thua k dc la so am");
		else {
			int s = 1;
			for (int i = 1; i <= n; i++) {
				s *= i;
			}
			System.out.println("giai thua la " + s);
		}
	}
}
