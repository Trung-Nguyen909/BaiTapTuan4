/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_5;
import java.util.Scanner;
public class Bai_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập 2 số: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int a1=a;
        int b1=b;
       while (b1 != 0) {
            int t = b1;
            b1 = a1 % b1;
            a1 = t ;
        }
        System.out.printf("Ước chung lớn nhất là: %d\n", a1 );
        System.out.printf("Bội chung nhỏ nhất là: %d",(a*b)/a1);
    }
}

