package InstanceGenerator;

import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGeneratorP;
import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGeneratorRandom;
import org.junit.Test;

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
}
