package fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InstanceGeneratorP implements InstanceGenerator {
    /**
     * All tasks : each value is duration of a task
     */
    List<Integer> D;
    /**
     * All machines : each value is the cumulated duration of all done tasks
     */
    List<Integer> M;

    int p;

    /**
     * Ask for variables and create a MIN-MAKESPAN problem instance
     * @return
     */
    public InstanceGeneratorP () {
        System.out.println("-- Génération d’une instance de type Ip --");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez p :");
        p = scanner.nextInt();
    }

    @Override
    public void generateMachinesTasks () {
        // Number of tasks
        int n = 2 * p^2 + 2 * p + 1;

        // Number of machines
        int m = 2 * p;

        D = new ArrayList<>();
        M = new ArrayList<>();

        /* Tasks generation */
        // 4p tasks duration 1
        int nbTasksDuration1 = 4 * p;
        for (int i = 0; i < nbTasksDuration1; i++) {
            D.add(1);
        }

        // 2p(p − 1) tasks duration 2
        int nbTasksDuration2 = 2 * p * (p - 1);
        for (int i = 0; i < nbTasksDuration2; i++) {
            D.add(2);
        }

        // 1 duration 2p
        D.add(2 * p);
        /* End Tasks generation */

        // Machines generation (2p)
        for (int i = 0; i < 2 * p; i++) {
            M.add(0);
        }
    }

    @Override
    public void executeAlgorithms() {
        System.out.println("Executed Ip");
    }
}
