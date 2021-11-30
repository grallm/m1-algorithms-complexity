package fr.univnantes.complexity_m1_malo_ismael.MMInstance;

import java.util.List;

public interface MMInstance {
    List<Integer> getMachines();
    List<Integer> getTasks();
    int getnbTask();
    void addTaskToMachine(int pos ,int task);
    int getMachine( int nb);
    int nombreMachines();
}
