import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        int soma = 0;
        int contador = 0;

        while (contador < n) {
            int numero = sc.nextInt();
            if (numero > 0) {
                soma += numero;
                contador++;
            }
        }

        int media = soma / n;
        System.out.println("A média dos números inteiros positivos é: " + media);

        sc.close();
    }
}

