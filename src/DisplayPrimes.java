import java.util.Scanner;

public class DisplayPrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so luong so nguyen to can in: ");
        int number = input.nextInt();

        int count = 0;

        for (int N=2; count<number;N++) {
            boolean check = true;
            for (int i=2;i<=Math.sqrt(N);i++) {
                if (N%i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(N+" ");
                count++;
            }
        }

    }
}
