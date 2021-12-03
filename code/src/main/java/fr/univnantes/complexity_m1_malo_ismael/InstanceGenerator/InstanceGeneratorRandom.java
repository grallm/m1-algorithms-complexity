package fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator;

import fr.univnantes.complexity_m1_malo_ismael.MMInstance.InstanceRandom;
import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;
import fr.univnantes.complexity_m1_malo_ismael.algorithms.MMAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstanceGeneratorRandom implements InstanceGenerator {
    /**
     * Number of different instances
     */
    int m;
    /**
     * Number of different instances
     */
    int n;
    /**
     * Number of different instances
     */
    int k;
    /**
     * Minimal duration
     */
    int dmin;
    /**
     * Maximal duration
     */
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

    public InstanceGeneratorRandom(int m, int n, int k, int dmin, int dmax) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.dmin = dmin;
        this.dmax = dmax;
    }

    @Override
    public void generateInstances () {
        instanceRandoms = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            instanceRandoms.add(new InstanceRandom(m, n, dmax, dmin));
        }

        // System.out.println("\n" + k + " instances générées avec " + m + " machines et " + n + " tâches");
    }

    @Override
    public void executeAlgorithms() {
        System.out.println("Executing Ir (k = " + instanceRandoms.size() + ")");

        double lsaRatioAvg = 0, lptRatioAvg = 0, rmaRatioAvg = 0;

        // Execute all 3 algorithms for each instance
        for (InstanceRandom instanceRandom : instanceRandoms) {
            lsaRatioAvg += MMAlgorithms.LSA((MMInstance) instanceRandom.clone()).getRatio();
            lptRatioAvg += MMAlgorithms.LPT((MMInstance) instanceRandom.clone()).getRatio();
            rmaRatioAvg += MMAlgorithms.RMA((MMInstance) instanceRandom.clone()).getRatio();
        }

        System.out.println("\nRatio LSA : " + lsaRatioAvg / instanceRandoms.size());
        System.out.println("Ratio LPT : " + lptRatioAvg / instanceRandoms.size());
        System.out.println("Ratio RMA : " + rmaRatioAvg / instanceRandoms.size());
    }

    public double executeLsa() {
        double lsaRatioAvg = 0;

        for (InstanceRandom instanceRandom : instanceRandoms) {
            lsaRatioAvg += MMAlgorithms.LSA((MMInstance) instanceRandom.clone()).getRatio();
        }

        return lsaRatioAvg / instanceRandoms.size();
    }

    public double executeLpt() {
        double lsaRatioAvg = 0;

        for (InstanceRandom instanceRandom : instanceRandoms) {
            lsaRatioAvg += MMAlgorithms.LPT((MMInstance) instanceRandom.clone()).getRatio();
        }

        return lsaRatioAvg / instanceRandoms.size();
    }

    public double executeRma() {
        double lsaRatioAvg = 0;

        for (InstanceRandom instanceRandom : instanceRandoms) {
            lsaRatioAvg += MMAlgorithms.RMA((MMInstance) instanceRandom.clone()).getRatio();
        }

        return lsaRatioAvg / instanceRandoms.size();
    }
}
