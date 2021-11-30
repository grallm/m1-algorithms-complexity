package fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator;

import java.util.Scanner;

public class InstanceGeneratorRandom implements InstanceGenerator {
    /**
     * Ask for variables
     * @return
     */
    public InstanceGeneratorRandom () {
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
    }

    @Override
    public void executeAlgorithms() {
        System.out.println("Executed IRandom");
    }
}
