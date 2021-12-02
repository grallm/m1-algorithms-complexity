package fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator;

import fr.univnantes.complexity_m1_malo_ismael.algorithms.AlgorithmResult;
import fr.univnantes.complexity_m1_malo_ismael.algorithms.MMAlgorithms;
import fr.univnantes.complexity_m1_malo_ismael.MMInstance.InstanceP;
import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;

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
        System.out.println("Executing Ip (p = " + this.p + ")");

        AlgorithmResult lsa = MMAlgorithms.LSA((MMInstance) instanceP.clone());
        System.out.println("\nRésultat LSA : " + lsa.getResult());
        System.out.println("Ratio LSA : " + lsa.getRatio());

        AlgorithmResult lpt = MMAlgorithms.LPT((MMInstance) instanceP.clone());
        System.out.println("\nRésultat LSA : " + lpt.getResult());
        System.out.println("Ratio LSA : " + lpt.getRatio());

        AlgorithmResult RMA = MMAlgorithms.RMA((MMInstance) instanceP.clone());
        System.out.println("\nRésultat RMA : " + RMA.getResult());
        System.out.println("Ratio RMA : " + RMA.getRatio());
    }
}
