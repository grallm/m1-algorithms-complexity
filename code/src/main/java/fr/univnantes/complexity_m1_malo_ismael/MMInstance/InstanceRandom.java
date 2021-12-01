package fr.univnantes.complexity_m1_malo_ismael.MMInstance;

import java.util.*;

/**
 * A MIN-MAKESPAN problem instance with random values
 */
public class InstanceRandom extends MMInstance {
    /**
     *
     * @param m number of machines
     * @param n number of tasks
     * @param dmax maximum duration
     * @param dmin minimum duration
     */
    public InstanceRandom(int m, int n, int dmax, int dmin) {
        D = new ArrayList<>();
        M = new ArrayList<>();

        // Tasks generation
        for (int i = 0; i < n; i++) {
            Random r = new Random();
            D.add(r.nextInt(dmax - dmin) + dmin);
        }

        // Machines generation
        for (int i = 0; i < m; i++) {
            M.add(0);
        }
    }
}
