package fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator;

import fr.univnantes.complexity_m1_malo_ismael.MMAlgorithms;
import fr.univnantes.complexity_m1_malo_ismael.MMInstance.InstanceP;
import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstanceGeneratorP implements InstanceGenerator {
    InstanceP instanceP;
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

        scanner.close();
    }

    public InstanceGeneratorP (int p) {
        this.p = p;
    }

    @Override
    public void generateInstances () {
        instanceP = new InstanceP(p);
    }

    @Override
    public void executeAlgorithms() {
        System.out.println("Executed Ip");
        System.out.println("temps pour LSA : " + MMAlgorithms.LSA(instanceP.cl) );
        System.out.println("temps pour LPT : " + MMAlgorithms.LPT(instanceP) );
    }
}
