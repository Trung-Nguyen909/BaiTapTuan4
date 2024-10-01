/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_3;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương: ");
        int n= sc.nextInt();
        int gt=1;
        if (n<0) {
            System.out.println("Đây không phải số nguyên dương");
        }
        else {
            for (int i = 1; i <= n; i++)
                gt = gt * i;
            System.out.printf("Giai thừa của %d là: %d", n, gt );
        }
    }
}
