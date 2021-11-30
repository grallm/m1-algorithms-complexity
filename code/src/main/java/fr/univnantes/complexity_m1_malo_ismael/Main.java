package fr.univnantes.complexity_m1_malo_ismael;

import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGenerator;
import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGeneratorP;
import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGeneratorRandom;

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
        System.out.println( "=== MIN-MAKESPAN problem ===" );
        System.out.println( "Made by Malo GRALL & Ismael BENBRIK\n" );

        System.out.println("-- Instanciation --");
        System.out.println("Toutes les variables nécessaires à l'instanciation vont vous être demandées.");
        System.out.println("Tapez les dans la console.\n");

        Scanner scanner = new Scanner(System.in);

        // Instance generation mode selection
        System.out.println("Choisissez un mode de génération des instances (1-2) :");
        System.out.println("1. Génération d’une instance de type Ip");
        System.out.println("2. Génération aléatoire de plusieurs instances");
        InstanceGenerator instanceGenerator = scanner.nextInt() == 1
          ? new InstanceGeneratorP()
          : new InstanceGeneratorRandom();
        
        scanner.close();

        instanceGenerator.generateInstances();
    }
}
