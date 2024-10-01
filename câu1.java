/**
 * 
 */
package btaptuan4;

import java.util.Scanner;

/**
 * 
 */
public class câu1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n");
		int n = sc.nextInt();
		int s = 0;
		for (int i = 0; i <= n; i++) {
			s = s + i;
		}
		System.out.println("tong" + s);

	}

}
