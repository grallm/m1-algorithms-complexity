package fr.univnantes.complexity_m1_malo_ismael;

import fr.univnantes.complexity_m1_malo_ismael.MMInstance.MMInstance;

import java.util.List;

public class MMAlgorithms {
    public static int LSA (MMInstance instance) {
        //temps avant de commencer les taches
        int tempsdb = (int) System.currentTimeMillis();
        int machine = 0;

        List<Integer> machines = instance.getMachines();
        List<Integer> tasks = instance.getTasks();

        //Parcours toute les taches
        for(int task =0; task < tasks.size(); task++){
            Boolean affecter = false;
           //Affecte une tache a une machine de libre
            while( !affecter ){
                //Si une machine est libre alors on attribue la tache
                if(machines.get(machine) <= (int) System.currentTimeMillis()){
                    affecter = true;
                    instance.addTaskToMachine(machine, task);
                  //sinon on change de machine
                }else{
                    if(machine < machines.size() ){
                        machine ++;
                    }else{
                        machine = 0 ;
                      
                    }
                }
            }
        }
        // Calcule et renvoie temps
        return  (int) System.currentTimeMillis() - tempsdb;
    }

    /**
     * Run the LPT algorithm on an instance
     * @param instance
     * @return
     */
    public static int LPT (MMInstance instance) {
        // Tâches ordonnées de façon décroissante


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
