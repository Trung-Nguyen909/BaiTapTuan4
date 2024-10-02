/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_6;
import java.util.Scanner;
/**
 *
 * @author khoam
 */
public class bai_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n:");
        int n = sc.nextInt();
        int a=n, s = 0;
        while(a!=0){
            s=s*10+a%10;
            a/=10;
        }
        if(s==n)
            System.out.println(n+" la so doi xung");
        else 
            System.out.println(n+" khong la so doi xung");
    }
}
