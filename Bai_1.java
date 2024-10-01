/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_1;
import java.util.*;
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int n;
        System.out.print("Nhập n: ");
        n= sc.nextInt();
        for (int i=1;i<=n;i++){
            tong=tong+i;
        }
        System.out.printf("tổng từ 1 đến %d là: %d", n, tong);
    }
    
}
