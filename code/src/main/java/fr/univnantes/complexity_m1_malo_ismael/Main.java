package fr.univnantes.complexity_m1_malo_ismael;

import java.util.Scanner;

/**
 * Implémentation des algorithmes répondant au problème MIN-MAKESPAN
 * @author grallm
 * @author Valarin00
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "--- MIN-MAKESPAN problem ---" );
        System.out.println( "Made by Malo GRALL & Ismael BENBRIK\n" );

        System.out.println("Instanciation Ip");
        System.out.println("Toutes les variables nécessaires à l'instanciation vont vous être demandées.");
        System.out.println("Tapez les dans la console.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez p :");
        int p = scanner.nextInt();

        // Number of different instances
        System.out.println("Entrez le nombre d'instance différentes k :");
        int k = scanner.nextInt();

        // Minimal duration
        System.out.println("Entrez la durée minimum dmin :");
        int dmin = scanner.nextInt();

        // Maximal duration
        System.out.println("Entrez la durée maximum dmax :");
        int dmax = scanner.nextInt();

        System.out.println(p);
    }
}
