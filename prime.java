import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) { 
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }
}
