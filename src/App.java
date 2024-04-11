
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length ; i ++){
            sc.nextLine();
            System.out.println("Informe o produto:");
            String name = sc.nextLine();
            System.out.println("Informe o preço: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length ; i ++){
            sum += vect[i].getPrice();
        }
        double avg = sum/vect.length;

        System.out.printf("AVERAGE HEIGHT:  %.2f%n" , avg);

        sc.close();

    }
}
