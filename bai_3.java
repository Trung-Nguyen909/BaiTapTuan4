/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;
import java.util.Scanner;
/**
 *
 * @author khoam
 */
public class bai_3 {
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        Scanner sc = new Scanner(System.in);
        int n, s = 1;
        n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
            s*=i;
        System.out.println(n+"!="+s);
    }    
}
