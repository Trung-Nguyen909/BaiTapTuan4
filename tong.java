    import java.util.Scanner;
public class tong {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        if(n<1)
            System.out.println("Vui long nhap so nguyen duong n lon hon hoac bang 1");
        else {
            int sum = 0;
            for (int i =1; i<=n; i++)
                sum +=i;
            System.out.println("Tong cac so tu 1 den " + n + " la: " + sum );
        }
            
    }
    
}
