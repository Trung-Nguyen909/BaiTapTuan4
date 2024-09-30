import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int n = sc.nextInt();
        int dem = 0;
        for (int i=2;i<n;i++)
            if(n%i==0)
                dem = 1;
        if(dem==0)
            System.out.println(n+" là số nguyên tố");
        else
            System.out.println(n+" không phải là số nguyên tố");
    }
}
