

public class Bai2 {
    public static void main(String[] args){
        for (int n=1;n<=10;n++) {
            System.out.println("Bảng cửu chương của " + n + " là: ");
            for (int i = 1; i <= 10; i++)
                System.out.println(n * i);
        }
    }
}
