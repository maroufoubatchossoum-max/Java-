import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();
        
        long factoriel = 1;

        if (n < 0) {
            System.out.println("Le factoriel n'existe pas pour les nombres négatifs.");
        } else {
            for (int i = 1; i <= n; i++) {
                factoriel = factoriel * i;
            }
            System.out.println("Le factoriel de " + n + " est : " + factoriel);
        }

        scanner.close();
    }
}
