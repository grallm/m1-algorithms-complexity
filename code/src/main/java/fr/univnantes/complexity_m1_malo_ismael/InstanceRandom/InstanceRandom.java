package fr.univnantes.complexity_m1_malo_ismael.InstanceRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A MIN-MAKESPAN problem instance with random values
 */
public class InstanceRandom {
    /**
     * All tasks : each value is duration of a task
     */
    List<Integer> D;
    /**
     * All machines : each value is the cumulated duration of all done tasks
     */
    List<Integer> M;

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
