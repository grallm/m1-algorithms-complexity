package InstanceGenerator;

import fr.univnantes.complexity_m1_malo_ismael.InstanceGenerator.InstanceGeneratorP;
import org.junit.Test;

public class TestInstanceGeneratorP {
    @Test
    public void testInstanceGeneratorP_p10 () {
        int p = 11;
        InstanceGeneratorP instanceGeneratorP = new InstanceGeneratorP(p);

        instanceGeneratorP.generateInstances();
        instanceGeneratorP.executeAlgorithms();
    }
}
