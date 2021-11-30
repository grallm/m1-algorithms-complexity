package fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator;

import fr.univnantes.complexity_m1_malo_ismael.MMInstance.InstanceRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstanceGeneratorRandom implements InstanceGenerator {
    // Number of different instances
    int m;
    // Number of different instances
    int n;
    // Number of different instances
    int k;
    // Minimal duration
    int dmin;
    // Maximal duration
    int dmax;

    /**
     * Generated instances
     */
    List<InstanceRandom> instanceRandoms;

    /**
     * Ask for variables and create a MIN-MAKESPAN problem instance
     * @return
     */
    public InstanceGeneratorRandom () {
        System.out.println("-- Génération aléatoire de plusieurs instances --");
        Scanner scanner = new Scanner(System.in);

        // Number of different instances
        System.out.println("Entrez le nombre de machines m :");
        m = scanner.nextInt();

        // Number of different instances
        System.out.println("Entrez le nombre de tâches n :");
        n = scanner.nextInt();

        // Number of different instances
        System.out.println("Entrez le nombre d'instance différentes k :");
        k = scanner.nextInt();

        // Minimal duration
        System.out.println("Entrez la durée minimum dmin :");
        dmin = scanner.nextInt();

        // Maximal duration
        System.out.println("Entrez la durée maximum dmax :");
        dmax = scanner.nextInt();

        scanner.close();
    }

    @Override
    public void generateInstances () {
        instanceRandoms = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            instanceRandoms.add(new InstanceRandom(m, n, dmax, dmin));
        }

        System.out.println("\n" + k + " instances générées avec " + m + " machines et " + n + " tâches");
    }

    @Override
    public void executeAlgorithms() {
        System.out.println("Executed IRandom");
    }
}
