package InstanceGenerator;

import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGeneratorP;
import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGeneratorRandom;
import org.junit.Test;

import java.util.Random;

public class TestInstanceGeneratorR {
    @Test
    public void testInstanceGeneratorR_k10_m10n10 () {
        int k = 10, m = 10, n = 10;
        int dmin = 5, dmax = 15;
        InstanceGeneratorRandom instanceGeneratorRandom = new InstanceGeneratorRandom(m, n, k, dmin, dmax);

        instanceGeneratorRandom.generateInstances();
        instanceGeneratorRandom.executeAlgorithms();
    }

    @Test
    public void testInstanceGeneratorR_k50_m10n10 () {
        int k = 50, m = 10, n = 10;
        int dmin = 5, dmax = 15;
        InstanceGeneratorRandom instanceGeneratorRandom = new InstanceGeneratorRandom(m, n, k, dmin, dmax);

        instanceGeneratorRandom.generateInstances();
        instanceGeneratorRandom.executeAlgorithms();
    }

    @Test
    public void testInstanceGeneratorR_k10_m5n20 () {
        int k = 10, m = 5, n = 20;
        int dmin = 5, dmax = 15;
        InstanceGeneratorRandom instanceGeneratorRandom = new InstanceGeneratorRandom(m, n, k, dmin, dmax);

        instanceGeneratorRandom.generateInstances();
        instanceGeneratorRandom.executeAlgorithms();
    }

    @Test
    public void testInstanceR_Q8 () {
        Random rand = new Random();

        System.out.println("k,n,m,dmin,dmax,Ratio LSA,Ratio LPT,Ratio RMA");

        for (int k = 1; k <= 10; k++) {
            int m = rand.nextInt(k) + 1;
            int n = rand.nextInt(k) + 1;
            int dmin = rand.nextInt(k) + 1;
            int dmax = rand.nextInt(k) + dmin;

            InstanceGeneratorRandom instnaceGeneratorR = new InstanceGeneratorRandom(m, n, k, dmin, dmax + 1);
            instnaceGeneratorR.generateInstances();
            System.out.println(k + "," + n + "," + m + "," + dmin + "," + dmax + "," +
                    instnaceGeneratorR.executeLsa() + "," + instnaceGeneratorR.executeLpt() + "," + instnaceGeneratorR.executeRma());
        }
        System.out.println();

        for (int k = 15; k <= 60; k+=5) {
            int m = rand.nextInt(k - 1) + 1;
            int n = rand.nextInt(k - 1) + 1;
            int dmin = rand.nextInt(k - 1) + 1;
            int dmax = rand.nextInt(k) + dmin;

            InstanceGeneratorRandom instnaceGeneratorR = new InstanceGeneratorRandom(m, n, k, dmin, dmax);
            instnaceGeneratorR.generateInstances();
            System.out.println(k + "," + n + "," + m + "," + dmin + "," + dmax + "," +
                    instnaceGeneratorR.executeLsa() + "," + instnaceGeneratorR.executeLpt() + "," + instnaceGeneratorR.executeRma());
        }
        System.out.println();

        for (int k = 70; k <= 90; k+=10) {
            int m = rand.nextInt(k - 1) + 1;
            int n = rand.nextInt(k - 1) + 1;
            int dmin = rand.nextInt(k - 1) + 1;
            int dmax = rand.nextInt(k) + dmin;

            InstanceGeneratorRandom instnaceGeneratorR = new InstanceGeneratorRandom(m, n, k, dmin, dmax);
            instnaceGeneratorR.generateInstances();
            System.out.println(k + "," + n + "," + m + "," + dmin + "," + dmax + "," +
                    instnaceGeneratorR.executeLsa() + "," + instnaceGeneratorR.executeLpt() + "," + instnaceGeneratorR.executeRma());
        }
        System.out.println();

        for (int k = 100; k <= 200; k+=20) {
            int m = rand.nextInt(k - 1) + 1;
            int n = rand.nextInt(k - 1) + 1;
            int dmin = rand.nextInt(k - 1) + 1;
            int dmax = rand.nextInt(k) + dmin;

            InstanceGeneratorRandom instnaceGeneratorR = new InstanceGeneratorRandom(m, n, k, dmin, dmax);
            instnaceGeneratorR.generateInstances();
            System.out.println(k + "," + n + "," + m + "," + dmin + "," + dmax + "," +
                    instnaceGeneratorR.executeLsa() + "," + instnaceGeneratorR.executeLpt() + "," + instnaceGeneratorR.executeRma());
        }
        System.out.println();

        int k = 300;
        int m = rand.nextInt(k - 1) + 1;
        int n = rand.nextInt(k - 1) + 1;
        int dmin = rand.nextInt(k - 1) + 1;
        int dmax = rand.nextInt(k) + dmin;
        InstanceGeneratorRandom instnaceGeneratorR = new InstanceGeneratorRandom(m, n, k, dmin, dmax);
        instnaceGeneratorR.generateInstances();
        System.out.println(k + "," + n + "," + m + "," + dmin + "," + dmax + "," +
                    instnaceGeneratorR.executeLsa() + "," + instnaceGeneratorR.executeLpt() + "," + instnaceGeneratorR.executeRma());
    }
}
