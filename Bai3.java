import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương: ");
        int n= sc.nextInt();
        int tg=1;
        if (n<0) {
            System.out.println("Nhập sai");
        }
        else {
            for (int i = 1; i <= n; i++)
                tg = tg * i;
            System.out.println("Giai thừa của " + n + " là: " + tg);
        }
    }
}
