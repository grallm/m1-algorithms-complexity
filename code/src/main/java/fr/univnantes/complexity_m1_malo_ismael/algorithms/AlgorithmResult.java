package fr.univnantes.complexity_m1_malo_ismael.algorithms;

import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;

import java.util.List;

public class AlgorithmResult {
    double ratio;
    int result;
    List<Integer> finalTasks;
    List<Integer> finalMachines;

    public List<Integer> getFinalTasks() {
        return finalTasks;
    }

    public List<Integer> getFinalMachines() {
        return finalMachines;
    }

    public AlgorithmResult(double ratio, int result, List<Integer> finalTasks, List<Integer> finalMachines) {
        this.ratio = ratio;
        this.result = result;
        this.finalTasks = finalTasks;
        this.finalMachines = finalMachines;
    }

    public double getRatio() {
        return ratio;
    }

    public int getResult() {
        return result;
    }
}
