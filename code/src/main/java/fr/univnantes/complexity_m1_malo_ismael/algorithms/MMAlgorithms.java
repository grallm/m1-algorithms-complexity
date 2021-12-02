package fr.univnantes.complexity_m1_malo_ismael.algorithms;

import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;

import java.util.List;

public class MMAlgorithms {
    /**
     * Run the LSA algorithm on an instance
     * @param instance
     * @return
     */
    public static AlgorithmResult LSA(MMInstance instance) {
        // Ajouter chaque tâche à la machine ayant le moins de travail
        List<Integer> machines = instance.getMachines();

        List<Integer> tasks = instance.getTasks();

        // Parcours tous les taches
        for (int task : tasks) {
            // Premiere machine de la liste
            int machineMinIdx = 0;
            int machineMinValue = machines.get(0);
            // Parcours des machines pour trouver la première disponible
            for (int i = 1; i < machines.size(); i++) {
                int machine = machines.get(i);
                if (machineMinValue > machine) {
                    machineMinIdx = i;
                    machineMinValue = machine;
                }
            }
            // Ajout de la durée de la tache à la première machine disponible
            machines.set(machineMinIdx, machineMinValue + task);
        }

        return calcAlgoResult(tasks, machines);
    }

    /**
     * Run the LPT algorithm on an instance
     * 
     * @param instance
     * @return
     */
    public static AlgorithmResult LPT(MMInstance instance) {
        // Tâches ordonnées de façon décroissante
        List<Integer> tasks = instance.taskSortDesc();

        List<Integer> machines = instance.getMachines();

        // Ajouter chaque tâche à la machine ayant le moins de travail
        for (int task : tasks) {
            // Trouver machine minimum
            int minMachineIdx = 0;
            int minMachineValue = machines.get(0);
            for (int i = 1; i < machines.size(); i++) {
                if (machines.get(i) < minMachineValue) {
                    minMachineIdx = i;
                    minMachineValue = machines.get(i);
                }
            }
            // Ajouter tâche à la machine
            machines.set(minMachineIdx, machines.get(minMachineIdx) + task);
        }

        return calcAlgoResult(tasks, machines);
    }

    /**
     * Run the RMA algorithm on an instance
     * 
     * @param instance
     * @return
     */
    public static AlgorithmResult RMA(MMInstance instance) {
        // Ajouter chaque tâche à la machine ayant le moins de travail
        List<Integer> machines = instance.getMachines();

        List<Integer> tasks = instance.getTasks();

      
        // Calcule et renvoie temps
        return null;
    }

    private static int maxMachine(List<Integer> machines) {
        // Premiere tache de la liste
        int machineMaxValue = machines.get(0);
        // Calcul la machine la plus longue
        for (int i = 1; i < machines.size(); i++) {
            int machine = machines.get(i);
            if (machineMaxValue < machine) {
                machineMaxValue = machine;
            }
        }
        return machineMaxValue;

    }

    private static double borneInfMax(List<Integer> tasks) {
        // Premiere tache de la liste
        double borneMax = tasks.get(0);
        // Borne inférieur maximum
        for (int i = 1; i < tasks.size(); i++) {
            int task = tasks.get(i);
            if (borneMax < task) {
                borneMax = task;
            }
        }
        return borneMax;

    }

    private static double borneInfMoy(List<Integer> tasks, List<Integer> machines) {
        // Calcul borne inférieur moyenne
        double borneMoy = 0;
        for (int task : tasks) {
            borneMoy += task;
        }
        borneMoy = borneMoy / machines.size();
        return borneMoy;
    }

    private static AlgorithmResult calcAlgoResult (List<Integer> tasks, List<Integer> machines) {
        // Calcul la machine la plus longue
        int machineMaxValue = maxMachine(machines);

        // Borne inférieur maximum
        double borneMax = borneInfMax(tasks);

        // Calcul borne inférieur moyenne
        double borneMoy = borneInfMoy(tasks, machines);

        // Calcul des ratios :
        double B = Math.max(borneMax, borneMoy);
        double ratio = machineMaxValue / B;

        return new AlgorithmResult(ratio, machineMaxValue, tasks, machines);
    }
}
