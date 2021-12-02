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
}
