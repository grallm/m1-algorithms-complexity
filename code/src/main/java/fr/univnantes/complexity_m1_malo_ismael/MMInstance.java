package fr.univnantes.complexity_m1_malo_ismael;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A MIN-MAKESPAN problem instance
 */
public class MMInstance {
    /**
     * All tasks : each value is duration of a task
     */
    List<Integer> D;
    /**
     * All machines : each value is the cumulated duration of all done tasks
     */
    List<Integer> M;

    /**
     * Create a MIN-MAKESPAN problem instance
     * @param p
     * @param dmin minimum duration
     * @param dmax maximum duration
     */
    public MMInstance (int p, int dmin, int dmax) {
        // Number of tasks
        int n = 2 * p^2 + 2 * p + 1;

        // Number of machines
        int m = 2 * p;

        D = new ArrayList<>();
        M = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            // Tasks generation
            Random r = new Random();
            D.add(r.nextInt(dmin = dmax) + dmin);

            // Machines generation
            M.add(0);
        }
    }
}
