/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_4;
import java.util.*;
public class Bai_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập vào 1 số: ");
        int n = sc.nextInt();
        int dem = 0;
        for (int i=2;i<n;i++)
            if(n%i==0)
                dem = 1;
        if(dem==0)
            System.out.printf("%d là số nguyên tố", n);
        else
            System.out.printf("%d không phải là số nguyên tố", n);
    }
}

