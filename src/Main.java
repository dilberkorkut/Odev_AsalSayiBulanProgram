import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        boolean isPrime = true;

        for (int i = 2; i<n; i++){
            if(n%i ==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n+ " sayisi ASAL'dir.");
        } else {
            System.out.println(n+ " sayisi ASAL degildir.");
        }
    }
}