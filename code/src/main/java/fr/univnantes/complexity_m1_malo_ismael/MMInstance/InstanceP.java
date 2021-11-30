package fr.univnantes.complexity_m1_malo_ismael.MMInstance;

import java.util.ArrayList;
import java.util.List;

public class InstanceP implements MMInstance {
    /**
     * All tasks : each value is duration of a task
     */
    private List<Integer> D;
    /**
     * All machines : each value is the cumulated duration of all done tasks
     */
    private List<Integer> M;

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
    public void addTaskToMachine(int pos, int task) {
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
