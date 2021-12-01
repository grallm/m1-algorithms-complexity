package fr.univnantes.complexity_m1_malo_ismael.MMInstance;

import java.util.Collections;
import java.util.List;

public abstract class MMInstance {
    /**
     * All tasks : each value is duration of a task
     */
    protected List<Integer> D;
    /**
     * All machines : each value is the cumulated duration of all done tasks
     */
    protected List<Integer> M;

    public List<Integer> getMachines() { return M; }

    public List<Integer> getTasks() { return D; }

    /**
     * Sort tasks in descending order
     * @return
     */
    public List<Integer> taskSortDesc() {
        // Sort ASC
        Collections.sort(M);

        // Reverse for DESC
        Collections.reverse(M);

        return M;
    }
}
