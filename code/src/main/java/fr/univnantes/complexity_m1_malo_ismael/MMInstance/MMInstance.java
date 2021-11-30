package fr.univnantes.complexity_m1_malo_ismael.MMInstance;

import java.util.List;

public interface MMInstance {
    List<Integer> getMachines();
    List<Integer> getTasks();
    void addTaskToMachine(int pos ,int task);
    int getMachine( int nb);
    int getnbTask();
    int nombreMachines();
}
