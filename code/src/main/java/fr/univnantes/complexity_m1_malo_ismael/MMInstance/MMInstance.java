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

    public int getnbTask() { return D.size(); }

    public void addTaskToMachine(int pos , int task) {
        M.set(pos,M.get(pos) + task);
    }

    public int getMachine(int nb) { return M.get(nb); }

    public int nombreMachines() { return M.size(); }

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
