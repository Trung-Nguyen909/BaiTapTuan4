/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;
import java.util.Scanner;
/**
 *
 * @author khoam
 */
public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        boolean ok=true;
        int n = sc.nextInt();
        for(int i=2;i*i<n;i++)
            if(n%i==0)
                ok=false;
        if(ok) 
            System.out.println(n+" la so nguyen to");
        else 
            System.out.println(n+" khong phai la so nguyen to");
    } 
}
