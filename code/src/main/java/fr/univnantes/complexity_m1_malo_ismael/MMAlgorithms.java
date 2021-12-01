package fr.univnantes.complexity_m1_malo_ismael;

import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;

import java.util.List;

public class MMAlgorithms {
    public static int LSA (MMInstance instance) {
        List<Integer> machines = instance.getMachines();
        List<Integer> tasks = instance.getTasks();
        System.out.println(machines.toString());
        System.out.println(tasks.toString());
        //Parcours tous les taches
        for(int task : tasks){
            //Premiere machine de la liste
            int machineMinIdx = 0 ;
            int machineMinValue = machines.get(0);
            //Parcours des machines pour trouver la première disponible
            for(int i = 1; i < machines.size(); i++){
                int machine = machines.get(i);
                if(machineMinValue > machine){
                    machineMinIdx = i;
                    machineMinValue = machine;
                }
            }
            //Ajout de la durée de la tache à la première machine disponible
            machines.set(machineMinIdx, machineMinValue + task);
        }
        System.out.println(machines.toString());
        //Premiere machine de la liste
        int machineMaxValue = machines.get(0);
        //Parcours des machines pour trouver la machine qui a la durée la plus grande
        for(int i = 1; i < machines.size(); i++){
            int machine = machines.get(i);
            if(machineMaxValue < machine){
                machineMaxValue = machine;
            }
        }
        return machineMaxValue;
    }

    /**
     * Run the LPT algorithm on an instance
     * @param instance
     * @return
     */
    public static int LPT (MMInstance instance) {
        // Tâches ordonnées de façon décroissante
        List<Integer> tasks = instance.taskSortDesc();

        // Ajouter chaque tâche à la machine ayant le moins de travail
        List<Integer> machines = instance.getMachines();
        System.out.println("here");
        System.out.println(machines.toString());
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
        System.out.println(machines.toString());
        // Calcule et renvoie temps
        return 10;
    }

    /**
     * Run the RMA algorithm on an instance
     * @param instance
     * @return
     */
    public static int RMA (MMInstance instance) {
        // Calcule et renvoie temps
        return 10;
    }
}
