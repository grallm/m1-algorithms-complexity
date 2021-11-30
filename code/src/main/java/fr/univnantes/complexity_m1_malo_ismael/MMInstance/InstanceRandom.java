package fr.univnantes.complexity_m1_malo_ismael.MMInstance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A MIN-MAKESPAN problem instance with random values
 */
public class InstanceRandom implements MMInstance {
    /**
     * All tasks : each value is duration of a task
     */
    private List<Integer> D;
    /**
     * All machines : each value is the cumulated duration of all done tasks
     */
    private List<Integer> M;

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

    @Override
    public List<Integer> getMachines() {
        return M;
    }

    @Override
    public List<Integer> getTasks() {
        return D;
    }

    @Override
    public int getnbTask() {
        // TODO Auto-generated method stub
        return D.size();
    }

    @Override
    public void addTaskToMachine(int pos , int task) {
        // TODO Auto-generated method stub
        M.set(pos,M.get(pos) + task);
    }

    @Override
    public int getMachine(int nb) {
        // TODO Auto-generated method stub
        return M.get(nb);
    }

    @Override
    public int nombreMachines() {
        // TODO Auto-generated method stub
        return M.size();
    }
 
    
}
