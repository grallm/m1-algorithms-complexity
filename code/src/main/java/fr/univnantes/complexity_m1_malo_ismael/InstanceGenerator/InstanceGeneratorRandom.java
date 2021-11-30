package fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InstanceGeneratorRandom implements InstanceGenerator {
    /**
     * All tasks : each value is duration of a task
     */
    List<Integer> D;
    /**
     * All machines : each value is the cumulated duration of all done tasks
     */
    List<Integer> M;

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
        System.out.println("Entrez le nombre de tâches k :");
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
    }

    @Override
    public void generateMachinesTasks () {
        D = new ArrayList<>();
        M = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            // Tasks generation
            Random r = new Random();
            D.add(r.nextInt(dmin = dmax) + dmin);

            // Machines generation
            M.add(0);
        }
    }

    @Override
    public void executeAlgorithms() {
        System.out.println("Executed IRandom");
    }
}
