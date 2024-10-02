/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5;
import java.util.Scanner;
/**
 *
 * @author khoam
 */
public class bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so a, b:");
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a;
        d = b;
        while(c%d!=0) {
            int temp;
            temp = c % d;
            c = d;
            d = temp;
        }
        System.out.println("UCLN cua "+a+" va "+b+" la " + d );
        System.out.println("BCNN cua "+a+" va "+b+" la " + ((a*b)/d));
    }
}
