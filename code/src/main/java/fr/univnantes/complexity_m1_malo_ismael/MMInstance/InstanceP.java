package fr.univnantes.complexity_m1_malo_ismael.MMInstance;

import java.util.ArrayList;

public class InstanceP extends MMInstance {
    public InstanceP (int p) {
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
}
