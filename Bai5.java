import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập 2 số: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ucln=1;
        for (int i=1; (i<=a)&&(i<=b);i++)
            if((b%i==0) && (a%i==0))
                ucln=i;
        System.out.println("Ước chung lớn nhất là: "+ ucln);
        System.out.println("Bội chung nhỏ nhất là: "+(a*b)/ucln);
    }
}
