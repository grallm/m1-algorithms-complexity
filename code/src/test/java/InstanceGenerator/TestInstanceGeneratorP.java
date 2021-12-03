package InstanceGenerator;

import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGeneratorP;
import org.junit.Test;

public class TestInstanceGeneratorP {
    @Test
    public void testInstanceGeneratorP_p1 () {
        int p = 1;
        InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);

        instanceGeneratorP.generateInstances();
        instanceGeneratorP.executeAlgorithms();
    }

    @Test
    public void testInstanceGeneratorP_p10 () {
        int p = 10;
        InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);

        instanceGeneratorP.generateInstances();
        instanceGeneratorP.executeAlgorithms();
    }

    @Test
    public void testInstanceGeneratorP_p25 () {
        int p = 25;
        InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);

        instanceGeneratorP.generateInstances();
        instanceGeneratorP.executeAlgorithms();
    }

    @Test
    public void testInstanceP_LSA_Q3 () {
        for (int p = 1; p <= 10; p++) {
            InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);
            instanceGeneratorP.generateInstances();
            System.out.println(instanceGeneratorP.ratioLsa());
        }
        System.out.println();

        for (int p = 15; p <= 60; p+=5) {
            InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);
            instanceGeneratorP.generateInstances();
            System.out.println(instanceGeneratorP.ratioLsa());
        }
        System.out.println();

        for (int p = 70; p <= 90; p+=10) {
            InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);
            instanceGeneratorP.generateInstances();
            System.out.println(instanceGeneratorP.ratioLsa());
        }
        System.out.println();

        for (int p = 100; p <= 200; p+=20) {
            InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);
            instanceGeneratorP.generateInstances();
            System.out.println(instanceGeneratorP.ratioLsa());
        }
        System.out.println();

        InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(300);
        instanceGeneratorP.generateInstances();
        System.out.println(instanceGeneratorP.ratioLsa());
    }

    @Test
    public void testInstanceP_LPT_Q5 () {
        for (int p = 1; p <= 10; p++) {
            InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);
            instanceGeneratorP.generateInstances();
            System.out.println(instanceGeneratorP.ratioLpt());
        }
        System.out.println();

        for (int p = 15; p <= 60; p+=5) {
            InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);
            instanceGeneratorP.generateInstances();
            System.out.println(instanceGeneratorP.ratioLpt());
        }
        System.out.println();

        for (int p = 70; p <= 90; p+=10) {
            InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);
            instanceGeneratorP.generateInstances();
            System.out.println(instanceGeneratorP.ratioLpt());
        }
        System.out.println();

        for (int p = 100; p <= 200; p+=20) {
            InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);
            instanceGeneratorP.generateInstances();
            System.out.println(instanceGeneratorP.ratioLpt());
        }
        System.out.println();

        InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(300);
        instanceGeneratorP.generateInstances();
        System.out.println(instanceGeneratorP.ratioLpt());
    }
}
