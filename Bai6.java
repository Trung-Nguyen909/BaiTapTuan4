import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập một số có 3 chữ số: ");
        int n= sc.nextInt();
        int num =n;
        int daonguoc =0;
        while (num!=0){
            int du = num%10;
            daonguoc = daonguoc *10+du;
            num= num/10;
        }
        if (daonguoc != n)
            System.out.println(n+" không phải là số đối xứng.");
        else
            System.out.println(n+" là số đối xứng.");
    }
}
