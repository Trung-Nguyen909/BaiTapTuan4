    import java.util.Scanner;
    
public class bangcuuchuong {
    public static void main(String[] args) {
        int i,j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
