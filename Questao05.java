import java.util.Locale;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    System.out.println("Digite 10 números e eles serão somados ao final do programa");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    double e = sc.nextDouble();
    double f = sc.nextDouble();
    double g = sc.nextDouble();
    double h = sc.nextDouble();
    double i = sc.nextDouble();
    double j = sc.nextDouble();


    double somaTudo = a + b + c + d + e + f + g + h + i + j;

    System.out.println(somaTudo);
        
        sc.close();

    }
}
