import java.util.Scanner;
imoprt java.util.Locale;

public class Questao08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    double n1 = sc.nextInt(); 
    double n2 = sc.nextInt(); 
    double n3 = sc.nextInt(); 
    double n4 = sc.nextInt(); 
    double n5 = sc.nextInt(); 
    double n6 = sc.nextInt(); 
    double n7 = sc.nextInt(); 
    double n8 = sc.nextInt(); 
    double n9 = sc.nextInt(); 
    double n10 = sc.nextInt(); 

    int i;

        for (i=1; i<=10; i++) {
            if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5 && n1 > n6 && n1 > n7 && n1 > n8 && n1 > n9 && n1 > n10) {
                System.out.println(n1);
            }

        sc.close();

        }
    }
}

