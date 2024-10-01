/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_6;
import java.util.*;
public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào một số: ");
        int n = sc.nextInt();
        int s1 = n;
        int s2 = 0;
        while (n != 0) {
            int x = n % 10;
            s2 = s2 * 10 + x;
            n =n/10;
        }
        if (s1 == s2) {
            System.out.printf("%d là số đối xứng", s1);
        } else {
            System.out.printf("%d không phải là số đối xứng", s1);
        }
    }
    
}
